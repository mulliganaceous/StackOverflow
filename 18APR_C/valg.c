pr_graph * pr_graph_load(
char const * const ifname) {
	FILE * fin = fopen(ifname, "r");
	pr_graph * graph = malloc(sizeof(*graph));

	char * line = malloc(1024 * 1024);
	size_t len = 0;

	/* Read in graph one vertex at a time. */
	for(pr_int v=0; v < graph->nvtxs; ++v) {
		ssize_t read = getline(&line, &len, fin);
		if(read == -1) {
			free(line);
			fprintf(stderr, "ERROR: premature EOF at line %lu\n", v+1);
			pr_graph_free(graph);
			return NULL;
}

/* Store the beginning of the adjacency list. */
graph->xadj[v] = edge_ptr;

/* Check for sinks -- these make pagerank more difficult. */
if(read == 1) {
	fprintf(stderr, "WARNING: vertex '%lu' is a sink vertex.\n", v+1);
	continue;
}

/* Foreach edge in line. */
char * ptr = strtok(line, " ");
while(ptr != NULL) {
	char *end = NULL;
	pr_int const e_id = strtoull(ptr, &end, 10);
	/* end of line */
	if (ptr == end) {
		break;
	}
	assert(e_id > 0 && e_id <= graph->nvtxs);

	graph->nbrs[edge_ptr++] = e_id - 1; /* 1 indexed */
	ptr = strtok(NULL, " ");
}
 }
 assert(edge_ptr == graph->nedges);
 graph->xadj[graph->nvtxs] = graph->nedges;

 free(line);
 fclose(fin);

 return graph;
