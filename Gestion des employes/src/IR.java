public abstract class IR {
    private static double[] tranches = {0, 30001, 50001, 60001, 80001, 180001};
    private static double[] tauxxIR = {0, 0.1, 0.2, 0.3, 0.34, 0.38};
    public static double getIR(double salaire){
        for (int i = 1; i<6; i++){
            if (salaire < tranches[i]){
                return tauxxIR[i - 1];
            }
        }
        return tauxxIR[5];
    }

}
