class TesteTransformacaoLinear {
    public static void main(String[] args) {
        int[][] escala = { {2, 0}, {0, 2} };
        int[][] rotacao90 = { {0, -1}, {1, 0} };
        int[][] reflexaoX = { {1, 0}, {0, -1} };

        TransformacaoLinear tEscala = new TransformacaoLinear(escala);
        TransformacaoLinear tRotacao90 = new TransformacaoLinear(rotacao90);
        TransformacaoLinear tReflexaoX = new TransformacaoLinear(reflexaoX);

        int[] vetorU = {1, 0};
        int[] vetorV = {1, -1};
        int[] vetorW = {0, -1};

        testarTransformacao(tEscala, vetorU);
        testarTransformacao(tRotacao90, vetorV);
        testarTransformacao(tReflexaoX, vetorW);
    }

    public static void testarTransformacao(TransformacaoLinear t, int[] vetor) {
        t.exibirMatriz();
        int[] resultado = t.aplicarTransformacao(vetor);
        System.out.println("Vetor transformado: (" + resultado[0] + ", " + resultado[1] + ")");
        System.out.println();
    }
}
