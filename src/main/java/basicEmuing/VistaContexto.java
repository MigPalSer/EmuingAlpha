package basicEmuing;

import java.util.Map;
import java.util.Set;

import interfaces.Item;
import interfaces.Vista;

public class VistaContexto implements Vista {

	int idl;


	public VistaContexto(int idl) {
		super();
		this.idl = idl;
	}

	@Override
	public String getStringDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cmdRecarga() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] alias(String[] cmd) {
		// TODO Auto-generated method stub
		return Vista.super.alias(cmd);
	}

	


}
