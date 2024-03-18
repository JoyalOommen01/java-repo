class cpu
{
	int price=3000;
	class processor
	{
		int cores=4;
		String manufacturer="pentium";
	}
	void proc()
	{
		cpu.processor pc = new cpu.processor();
		System.out.println("processor:-\ncores="+pc.cores+"\nmanufacturer="+pc.manufacturer);
	}
	static class ram
	{
		static int memory = 64;
		static String man="intel";
	}
	public static void main(String args[])
	{
		cpu cp= new cpu();
		cpu.ram rm =  new cpu.ram();
		System.out.println("cpu:-\nprice="+cp.price);
		cp.proc();
		System.out.println("ram:-\nmemory="+rm.memory+"\nmanufacturer="+rm.man);
	}
}
			
