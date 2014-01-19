package elsaMahari;

import com.google.inject.Binder;
import com.google.inject.Module;

public class BooksModule implements Module {

	@Override
	public void configure(Binder binder) {

		binder.bind(BooksResource.class);
	}

}
