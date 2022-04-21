package usingoops;

public interface IdPrinter {
        void printId();
        default void printDline() {
        	System.out.println("----------------------------------------");
        }
		
}
