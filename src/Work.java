import testeHomeWork.Vehicle;

public class Work {
    public static void main(String[] args) {
           // poli morph - abilitatea unui obiect de a se identifica in mai multe tipuri

         //Vehicle bike = new Bike() ;
        //Vehicle nu poat fi instantia.
       //bike.getIdentity();

        Truck truck = new Truck();        // se identifica fiind Vehicul
        Bike bike = new Bike();          //    -//-
                                        // subclase ale clasei Obiect Vehicul

        Vehicle[] race = {truck,bike};  // putem pune data type Object
        for(Vehicle x :race){          // - Vehicle  -  apoi x = counter , race = nume array
            x.go();                   // va itera unul cate unul  x = rep vehiculele cu care lucram . go() method
        }                            // in for () nu are importanta ce vehicul esti atat timp cat esti in array
    }
}

