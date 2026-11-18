package MetodoRungeKutta;

public class MetodoRungenKutta {
    public static void metodo(double x0, double y0, double h, double xFinal) {
        int nPasos = (int)Math.round((xFinal-x0)/h);
        double x = x0;
        double y = y0;

        System.out.println("n\tx_n\t y_n(RK4)");
        System.out.println("--------------------------------");
        System.out.printf("%d\t %.4f\t %.4f\n",0,x,y);

        for(int i = 0; i < nPasos; i++) {
            //TODO:Implementar el calculo de las 4 pendientes (k1,k2,k3,k4)
            //y la actualizacion ponderada de y junto con el avance de x en h

            System.out.printf("%d\t %.4f\t %.4f\n",i+1,x,y);
        }

        System.out.printf("\nf(x,y) = (%.4f, %.4f)\n", x, y);
    }
}
