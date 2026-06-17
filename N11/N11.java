package N11;

public class N11 {

    public int maxArea(int[] height) {
        final int n = height.length;
        final int max = 2;
        int capacidad = 0;
        int alturaAct = 0;
        int mejorCpa = 0;

        int puntero1 = 0;
        int puntero2 = n - 1;

        while ((puntero1 < n && puntero2 < n) && puntero1 < puntero2) {
            capacidad = (puntero2 - puntero1) * Math.min(height[puntero1], height[puntero2]);

            if (capacidad > mejorCpa)
                mejorCpa = capacidad;

            if (height[puntero1] < height[puntero2]) {
                alturaAct = puntero1;
                puntero1++;
            } else {
                alturaAct = puntero2;
                puntero2--;
            }

        }

        return mejorCpa;
    }
}
