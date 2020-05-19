package InterfaceConcepts;

public class TestHospital {
    public static void main(String[] args) {

        //USMedical us = new USMedical();
     ApolloHospital ap = new ApolloHospital();
     ap.ambulanceServices();
     ap.ENTServices();
     ap.OPTServices();
     ap.getPatientHistory();
     USMedical.Service_911();
// static in nature by default can not be called using obj name but can be call on class name see below
System.out.println(USMedical.min_fee);
     //top casting is allowed for interfaces, where class obj is referred by interface/parent
        // top casting is creating obj of child class referred by parent/interface
        USMedical us = new ApolloHospital();
        us.physioServices();
        us.orthopedicServices();
        us.Internship();

        UKMedical uk = new ApolloHospital();
        uk.ENTServices();
        uk.ambulanceServices();

        IndianMedical in = new ApolloHospital();
        in.radiologyServices();

        //down casting is not allowed because we can not create obj of interface
        //ApolloHospital ap = new UKMedical();

    }
}
