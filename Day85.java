    interface printable{
        void print();
    }
    class Quiz implements printable{
        public void print() {
            System.out.println("hello world");
        }
    
    public static void main(String[] args) {
        Quiz obj = new Quiz();
        obj.print();
    }
}
