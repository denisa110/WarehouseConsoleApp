package details;

public abstract class SystemBag {

	// Teorie: Intr-o clasa abstracta pot exista si metode fara nicio implementare

	abstract void start();

	static void started() {
		System.out.println(" Welcome to the Bag System! ");
	}

	abstract void end();

	static void ended() {
		System.out.println(" The Airport System is closed. ");
	}

	void stop() {

	}

}
