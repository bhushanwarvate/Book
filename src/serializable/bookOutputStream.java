package serializable;


import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
	public class bookOutputStream extends ObjectOutputStream
	{
		public bookOutputStream(OutputStream out) throws IOException {
			super(out);
	  }
		
		protected void writeStreamHeader() {}

	}

