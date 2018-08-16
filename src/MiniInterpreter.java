import java.util.*;

public class MiniInterpreter {

    private String code;

    //The tape is a string of binary code. Simple enough
    private String tape;

    public MiniInterpreter(String tape,String code) {
        this.tape = tape;
        this.code = code;

    }

    private String[] splitTape() {
        return this.tape.split("");
    }

    private String[] splitCode() {
        return this.code.split("");
    }

    private static String flipBit(String bit) {
        if (bit.equals("0")) {
            return "1";
        } else {
            return "0";
        }
    }

    private static String joinList(String[] bitList) {
        String arrangedBits = "";

        for (Object bit: bitList) {
            arrangedBits += (String) bit;
        }

        return arrangedBits;
    }

    public String interpreter() {
        List<String> List_tape = new ArrayList<>(Arrays.asList(splitTape()));
        String[] Arraycode = splitCode();
        String currBit;

        ListIterator listIterator = List_tape.listIterator();

        currBit = (String) listIterator.next();
        System.out.println("The next index : " + listIterator.nextIndex());
        System.out.println("The previous index : " + listIterator.previousIndex());

        for (int i = 0; i < Arraycode.length; i++) {
            switch (Arraycode[i]) {
                case "*" :
                    System.out.println("The * : " + currBit);
                    System.out.println("The next index : " + listIterator.nextIndex());
                    System.out.println("The previous index : " + listIterator.previousIndex());

                    currBit = flipBit(currBit);
                    listIterator.set(currBit);
                    System.out.println("Now the bit is : " + currBit);
                    break;
                case ">" :
                    if (listIterator.hasNext()) {
                        currBit = (String) listIterator.next();
                        System.out.println("The > : " + currBit);
                        System.out.println("The next index : " + listIterator.nextIndex());
                        System.out.println("The previous index : " + listIterator.previousIndex());
                    }
                    break;
                case "<" :
                    if (listIterator.hasPrevious()) {
                        currBit = (String) listIterator.previous();
                        System.out.println("The < : " + currBit);
                        System.out.println("The next index : " + listIterator.nextIndex());
                        System.out.println("The previous index : " + listIterator.previousIndex());
                    }
                    break;
            }
        }

        //return joinList(List_tape);
        return "";
        }

        public String interpertArray() {

            int iteratorPointer = 0;

            String[] tapeArray = splitTape();
            String[] codeArray = splitCode();

            //CurrBit is the index 0 of the tape array
            String currBit = tapeArray[iteratorPointer];

            try {
                for (int i = 0; i < codeArray.length; i++) {
                    switch (codeArray[i]) {
                        case "*" :
                            System.out.println("The command * as the currBit : " + currBit);
                            currBit = flipBit(currBit);
                            System.out.println("Now the current bit is : " + currBit);
                            tapeArray[iteratorPointer] = currBit;
                            break;
                        case ">" :
                            iteratorPointer++;
                            currBit = tapeArray[iteratorPointer];
                            System.out.println("The > command comes the bit : " + currBit);
                            break;
                        case "<" :
                            iteratorPointer--;
                            currBit = tapeArray[iteratorPointer];
                            System.out.println("The < command comes the bit : " + currBit);
                            break;
                        case "]" :
                            if(currBit.equals("1")) {
                                int indexOf = Arrays.asList(codeArray).indexOf("[");
                                System.out.println("The index for [ is : " + indexOf);
                                i = indexOf;
                                break;
                            }
                            break;
                        case "[" :
                            if (currBit.equals("0")) {
                                int indexOf = Arrays.asList(codeArray).lastIndexOf("]");
                                System.out.println("The index of ] : " + indexOf);
                                i = indexOf;
                            } else {
                                continue;
                            }

                    }
                }

                return joinList(tapeArray);

            } catch (ArrayIndexOutOfBoundsException exception) {
                return joinList(tapeArray);
            }


        }
    }

/**
 *  for (int i = 0; i < code.length; i++) {
 *             switch (code[i]) {
 *                 case "*" :
 *                     System.out.println("Current Iterator number : " + i);
 *                      tape[i] = flipBit(tape[i]);
 *                      break;
 *                 case ">" :
 *                     System.out.println("Current Iterator number : " + i);
 *                     continue;
 *                 case "<" :
 *                     i--;
 *                     System.out.println("Current Iterator number : " + i);
 *                     break;
 *                 }
 *             }
 */


