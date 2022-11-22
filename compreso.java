public static int compreso (int a, int b, int c){
if  ((a>b & c<b) || (a<b & c>b)){
    System.out.println(b + " e compreso tra " + a + " e " + c);
return b;
}else {
    System.out.println(b + " Non e compreso tra i due numeri " + a + " e " + c);
return b;
    }
};
