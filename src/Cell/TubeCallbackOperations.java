package Cell;


/**
* Cell/TubeCallbackOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cell.idl
* Tuesday, May 2, 2023 4:45:28 PM MSK
*/


/* =B5@D59A >1@0B=>3> 2K7>20 B@C1:8 */
public interface TubeCallbackOperations 
{

  /* @8=OBL A>>1I5=85 message >B =><5@0 fromNum */
  int sendSMS (String fromNum, String message);

  /* 5@=CBL A2>9 =><5@ */
  String getNum ();
} // interface TubeCallbackOperations