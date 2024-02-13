package outlab5_noahCunningham;

public class adtDriver {
	
	public static void main(String args[]) {
		/**test for string and integer array stack**/
		System.out.println("----test for string and integer array stack----");
		System.out.println();
		arrayStack<String> SAS = new arrayStack<>();
		SAS.push("uno");
		SAS.push("dos");
		SAS.push("tres");
		SAS.push("quatro");
		SAS.push("cinco");
		System.out.println(SAS.toString());
		SAS.pop();
		SAS.pop();
		System.out.println(SAS.toString());
		System.out.println(SAS.top());
		System.out.println(SAS.isEmpty());
		
		arrayStack<Integer> IAS = new arrayStack<>();
		IAS.push(1);
		IAS.push(2);
		IAS.push(3);
		IAS.push(4);
		IAS.push(5);
		System.out.println(IAS.toString());
		IAS.pop();
		IAS.pop();
		System.out.println(IAS.toString());
		System.out.println(IAS.top());
		System.out.println(IAS.isEmpty());
		
		/**test for string and integer in dllStack**/
		System.out.println();
		System.out.println("----test for string and integer in dllStack----");
		System.out.println();
		dllStack<String> SdllS = new dllStack<>();
		SdllS.push("seis");
		SdllS.push("siete");
		SdllS.push("ocho");
		SdllS.push("nueve");
		SdllS.push("dies");
		System.out.println(SdllS.toString());
		SdllS.pop();
		SdllS.pop();
		System.out.println(SdllS.toString());
		System.out.println(SdllS.top());
		System.out.println(SdllS.isEmpty());
		
		dllStack<Integer> IdllS = new dllStack<>();
		IdllS.push(6);
		IdllS.push(7);
		IdllS.push(8);
		IdllS.push(9);
		IdllS.push(10);
		System.out.println(IdllS.toString());
		IdllS.pop();
		IdllS.pop();
		System.out.println(IdllS.toString());
		System.out.println(IdllS.top());
		System.out.println(SdllS.isEmpty());
		
		/**test for string and integer in dllQueue**/
		System.out.println();
		System.out.println("----test for string and integer in dllQueue----");
		System.out.println();
		dllQueue<String> SdllQ = new dllQueue<>();
		SdllQ.enqueue("once");
		SdllQ.enqueue("doce");
		SdllQ.enqueue("trece");
		SdllQ.enqueue("catorce");
		SdllQ.enqueue("quince");
		System.out.println(SdllQ.toString());
		SdllQ.dequeue();
		SdllQ.dequeue();
		System.out.println(SdllQ.toString());
		System.out.println(SdllQ.first());
		System.out.println(SdllQ.isEmpty());
		
		dllQueue<Integer> IdllQ = new dllQueue<>();
		IdllQ.enqueue(11);
		IdllQ.enqueue(12);
		IdllQ.enqueue(13);
		IdllQ.enqueue(14);
		IdllQ.enqueue(15);
		System.out.println(IdllQ.toString());
		IdllQ.dequeue();
		IdllQ.dequeue();
		System.out.println(IdllQ.toString());
		System.out.println(IdllQ.first());
		System.out.println(IdllQ.isEmpty());
		
		/**Call Stack validator test**/
		System.out.println();
		System.out.println("----Call Stack validator test----");
		System.out.println();
		CallStackValidator tester = new CallStackValidator();

		// should validate

		String callStack = "A calls B B calls C C halts B halts A halts";
		System.out.println(tester.isValid(callStack));
		
		callStack = "A calls B B calls C C calls D D halts C calls E E halts C halts B halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls A A halts A halts";
		System.out.println(tester.isValid(callStack));

		callStack = "main calls functionA functionA calls testMe testMe halts functionA calls runRun runRun halts functionA halts main halts";
		System.out.println(tester.isValid(callStack));

		// Should fail

		callStack = "main calls A A calls B A calls C B halts C halts A halts main halts";
		System.out.println(tester.isValid(callStack));

		callStack = "A calls B B halts";
		System.out.println(tester.isValid(callStack));
	}
}
