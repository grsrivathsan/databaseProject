package simpledb;

import java.io.Serializable;

/**
 * JoinPredicate compares fields of two tuples using a predicate. JoinPredicate
 * is most likely used by the Join operator.
 */
public class JoinPredicate implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public int field1;
    public Predicate.Op op;
    public int field2;

    /**
     * Constructor -- create a new predicate over two fields of two tuples.
     * 
     * @param field1
     *            The field index into the first tuple in the predicate
     * @param field2
     *            The field index into the second tuple in the predicate
     * @param op
     *            The operation to apply (as defined in Predicate.Op); either
     *            Predicate.Op.GREATER_THAN, Predicate.Op.LESS_THAN,
     *            Predicate.Op.EQUAL, Predicate.Op.GREATER_THAN_OR_EQ, or
     *            Predicate.Op.LESS_THAN_OR_EQ
     * @see Predicate
     */
    public JoinPredicate(int field1, Predicate.Op op, int field2) {
        // some code goes here
    	this.field1 = field1;
    	this.op = op;
    	this.field2 = field2;
    }

    /**
     * Apply the predicate to the two specified tuples. The comparison can be
     * made through Field's compare method.
     * 
     * @return true if the tuples satisfy the predicate.
     */
    public boolean filter(Tuple t1, Tuple t2) {
        // some code goes here
    	if((t1 != null) && (t2!=null))
    	{
    		return t1.getField(field1).compare(op, t2.getField(field2));
    	}
        return false;
    }
    
    public int getField1()
    {
        // some code goes here
    	return field1;
       // return -1;
    }
    
    public int getField2()
    {
        // some code goes here
    	return field2;
        //return -1;
    }
    
    public Predicate.Op getOperator()
    {
        // some code goes here
    	return op;
        //return null;
    }
}
