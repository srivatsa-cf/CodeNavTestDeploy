package com.cloudframe.app.dto.trdpbexc;

/**
*  The class ExceptionRecordLenGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-17 at 06:22. using version 5.0.0.169
**/


import com.cloudframe.app.dto.serialize.trdpbexc.*;
import com.cloudframe.app.exception.CFException;


public class ExceptionRecordLenGroup extends ExceptionRecordLenGroupSerialized { 
   

								private short exceptionRecordLen;
	
	/**
	* Constructor for ExceptionRecordLenGroup
	**/
    public ExceptionRecordLenGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of exceptionRecordLen
	 *	@return exceptionRecordLen
	 */
	public short getExceptionRecordLen() throws CFException {
        if (isExceptionRecordLenModified()) { 
           exceptionRecordLen = refreshExceptionRecordLen();
        }
   		return exceptionRecordLen;
	}
	
	/**
	 * 	Update ExceptionRecordLen with the passed value
	 *  Corresponding COBOL Variable is EXCEPTION-RECORD-LEN
	 *	@param number
	 */
	public void setExceptionRecordLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    exceptionRecordLen = checkExceptionRecordLenMaxLimit(number); 
		serializeExceptionRecordLen(exceptionRecordLen);
	}

	public void setExceptionRecordLen(int number) {
	    number = checkExceptionRecordLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExceptionRecordLen((short)number);
	}
	public void setExceptionRecordLen(long number) {
	    number = checkExceptionRecordLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExceptionRecordLen((short)number);
	}
	


	
	
	

		public static int getExceptionRecordLenGroupFieldLength() {
			return EXCEPTION_RECORD_LEN_GROUP_LENGTH;
		}

}
  
