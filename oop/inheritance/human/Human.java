package oop.inheritance.human;

    public class Human {
        private Ruki dlinnye;
        private Ruki    korotkie;


        public Human() {
            this.dlinnye = new Ruki("weis","bolwie");
            this.korotkie = new Ruki("black","korotkie");
        }

        public Ruki getDlinnye() {
            return dlinnye;
        }

        public Ruki getKorotkie() {
            return korotkie;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "dlinnye=" + dlinnye +
                    ", korotkie=" + korotkie +
                    '}';
        }
    }

