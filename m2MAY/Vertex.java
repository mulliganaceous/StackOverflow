package m2MAY;

public class Vertex implements Comparable<Vertex> {
	private String n;

	public Vertex opposite(Edge e, Vertex v) {
		if (e.getLink() == v) {
			return e.getTo();
		} else if (e.getTo() == v) {
			return e.getFrom();
		} else {
			return v;
		}
	}
	
	public String toString() {
		return n;
	}

	@Override
	public int compareTo(Vertex oth) {
		return this.compareTo(oth);
	}

	public class Edge {
		Vertex to;
		Vertex from;
		public Edge() {

		}

		public Vertex getLink() {
			return null;
		}

		public Vertex getTo() {
			return null;
		}

		public Vertex getFrom() {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Vertex v = new Vertex();
		v.n = "ADFASFDS";
		Vertex w = new Vertex();
		w.n = "ASFDASFASFSFAS";
		System.out.println(w.compareTo(v));
	}
}
