package MetodoRungeKutta;

public class MetodoRungenKutta {
    public static void metodo(double x0, double y0, double h, double xFinal) {
        int nPasos = (int)Math.round((xFinal-x0)/h);
        double x = x0;
        double y = y0;

        System.out.println("n\tx_n\t y_n(RK4)");
        System.out.println("--------------------------------");
        System.out.printf("%d\t %.4f\t %.6f\n",0,x,y);

        for(int i = 0; i < nPasos; i++) {
            //TODO:Implementar el calculo de las 4 pendientes (k1,k2,k3,k4)
            //y la actualizacion ponderada de y junto con el avance de x en h
            // Calculo de las cuatro pendientes
            double k1 = h * EvaluarF.evaluarFuncion(x, y);
            double k2 = h * EvaluarF.evaluarFuncion(x + h / 2, y + k1 / 2);
            double k3 = h * EvaluarF.evaluarFuncion(x + h / 2, y + k2 / 2);
            double k4 = h * EvaluarF.evaluarFuncion(x + h, y + k3);

            // Actualizacion de y mediante las cuatro pendientes
            y = y + (k1 + 2 * k2 + 2 * k3 + k4) / 6;

            // Actualizacion de x
            x = x + h;

            System.out.printf("%d\t %.4f\t %.6f\n",i+1,x,y);
        }

        System.out.printf("\nf(x,y) = (%.4f, %.6f)\n", x, y);
    }
}
