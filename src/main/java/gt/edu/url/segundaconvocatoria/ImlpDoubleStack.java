package gt.edu.url.segundaconvocatoria;

public class ImlpDoubleStack implements DoubleStack{

	private int redSize;
	private int pibot;
	private int blueSize;
	@Override
	public int red() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int blu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int redSize() {
		return redSize;
	}

	@Override
	public void redPush(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object redTop() {
	   if(redSize == 0)
	   {
		   return null;
	   }
	   return redSize();
	}

	@Override
	public Object redPop() {
		if(redSize == 0)
		   {
			   return null;
		   }
		   return redSize();
	}

	@Override
	public int blueSize() {
		return 0;
	}

	@Override
	public void bluePush(Object e) {
		if(blueSize == 0)
		   {
			   return;
		   }
		   return;
	}

	@Override
	public Object blueTop() {
		if(blueSize == 0)
		   {
			   return null;
		   }
		   return blueSize();
	}

	@Override
	public Object bluePop() {
		if(blueSize == 0)
		   {
			   return;
		   }
		   return;
	}

}
