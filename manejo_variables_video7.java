public class Declaraciones_Operadores{
    public static void main(String[] args){
        int a=5;
        int b;
        b=7;
        int c=b+a; // c es a + b
        c++; // incremento
        c+=8; // c = c + 8
        c = b/a; // se queda con la parte entera ( es int, no double )
        System.out.println(c);
    }
}
