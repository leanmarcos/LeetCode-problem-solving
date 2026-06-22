package N134;

public class N134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0; // gas en el tanque
        int total = 0; // total recorrido
        int start = 0; // inicio

        for (int i = 0; i < gas.length; i++) {
            int rest = gas[i] - cost[i]; // calcula lo que se puso en el tanque menos lo que costó llegar ahí
            tank += rest; // lo suma/resta al tanque
            total += rest; // lo suma/resta al total
            if (tank < 0) { // si el tanque está en 0 y se quedó sin gas
                start = i + 1; // inicia de nuevo
                tank = 0; // el tanque inicia de 0 de nuevo
            }
        }

        return total < 0 ? -1 : start; // retorna si al final está en 0(no encontró solución) o en más de 0 (encontró)
    }

}
