package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author tuxtor
 */
public interface DoubleStack<E> {
	//Obtener el tama;o de cada elemento
	int red();
	int blu();
	
        boolean isEmpty();
    
	int redSize();
	void redPush(E e);
	E redTop();
	E redPop();
        
        int blueSize();
	void bluePush(E e);
	E blueTop();
	E bluePop();
}
