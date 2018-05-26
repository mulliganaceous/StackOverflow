class Assembler:
    def __init__(self,
      reads,
      outdir,
      threads=1,
      careful=True,
      only_assembler=True,
      verbose=False,
      data_type='pacbio-raw',
    ):
        self.outdir = os.path.abspath(outdir)
        self.reads = os.path.abspath(reads)
        if not os.path.exists(self.reads):
            raise Error('Reads file not found:' + self.reads)

        self.verbose = verbose
        self.samtools = external_progs.make_and_check_prog('samtools', verbose=self.verbose)
        self.threads = threads
        self.assembler = assembler

        if self.assembler == 'racon':
            self.racon = external_progs.make_and_check_prog('racon', verbose=self.verbose, required=True)
            self.data_type = data_type
        else:
            raise Error('Unknown assembler: "' + self.assembler + '". cannot continue')

    def run_racon(self):
        '''Runs minimap, miniasm, racon instead of spades'''

        if self.data_type.split('-')[0] == 'pacbio':
            overlapRaadsType = 'ava-pb' # PacBio
        else:
            overlapReadsType = 'ava-ont' # Nanopore

    def run(self):
        if self.assembler == 'racon':
            self.run_racon()
        else:
            raise Error('Unknown assembler: "' + self.assembler + '". cannot continue')
