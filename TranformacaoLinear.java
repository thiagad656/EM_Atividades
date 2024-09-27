class TransformacaoLinear {
    private int[][] matriz;

    public TransformacaoLinear(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[] aplicarTransformacao(int[] vetor) {
        int[] resultado = new int[2];
        resultado[0] = matriz[0][0] * vetor[0] + matriz[0][1] * vetor[1];
        resultado[1] = matriz[1][0] * vetor[0] + matriz[1][1] * vetor[1];
        return resultado;
    }

    public void exibirMatriz() {
        System.out.println("Matriz de Transformação:");
        System.out.println(matriz[0][0] + " " + matriz[0][1]);
        System.out.println(matriz[1][0] + " " + matriz[1][1]);
    }
}
