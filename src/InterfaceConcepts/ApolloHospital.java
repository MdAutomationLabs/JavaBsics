package InterfaceConcepts;

public class ApolloHospital extends GlobalPatientData implements USMedical, UKMedical, IndianMedical{
    public static void main(String[] args) {

    }

    @Override
    public void physioServices() {
        System.out.println("Ap---phy");
    }

    @Override
    public void oncologyServices() {
        System.out.println("Ap---onc");
    }

    @Override
    public void orthopedicServices() {
        System.out.println("Ap---oth");
    }

    @Override
    public void radiologyServices() {
        System.out.println("Ap---rad");
    }

    @Override
    public void ENTServices() {
        System.out.println("Ap---ent");
    }

    @Override
    public void ambulanceServices() {
        System.out.println("Ap---amb");
    }

    @Override
    public void emergencyServices() {
        System.out.println("Ap---eme");
    }

    @Override
    public void neuroServices() {
        System.out.println("Ap---neu");
    }

    @Override
    public void peditricServices() {
        System.out.println("Ap---ped");
    }

    //non overridden methods

    public void OPTServices(){
        System.out.println("Ap---opt");
    }

    public void medicalInsurance(){
        System.out.println("Ap---med");
    }

    public void pathologyServices(){
        System.out.println("Ap---pat");
    }

    @Override
    public void polioService() {
        System.out.println("Ap---polio");
    }
}
