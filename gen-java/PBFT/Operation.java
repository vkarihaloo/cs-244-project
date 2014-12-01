/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package PBFT;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-11-30")
public class Operation implements org.apache.thrift.TBase<Operation, Operation._Fields>, java.io.Serializable, Cloneable, Comparable<Operation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Operation");

  private static final org.apache.thrift.protocol.TField OPERATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("operationId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField OPERATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("operationType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ARGUMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("arguments", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OperationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OperationTupleSchemeFactory());
  }

  public int operationId; // required
  public int operationType; // required
  public String arguments; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATION_ID((short)1, "operationId"),
    OPERATION_TYPE((short)2, "operationType"),
    ARGUMENTS((short)3, "arguments");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OPERATION_ID
          return OPERATION_ID;
        case 2: // OPERATION_TYPE
          return OPERATION_TYPE;
        case 3: // ARGUMENTS
          return ARGUMENTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __OPERATIONID_ISSET_ID = 0;
  private static final int __OPERATIONTYPE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATION_ID, new org.apache.thrift.meta_data.FieldMetaData("operationId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OPERATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("operationType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ARGUMENTS, new org.apache.thrift.meta_data.FieldMetaData("arguments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Operation.class, metaDataMap);
  }

  public Operation() {
  }

  public Operation(
    int operationId,
    int operationType,
    String arguments)
  {
    this();
    this.operationId = operationId;
    setOperationIdIsSet(true);
    this.operationType = operationType;
    setOperationTypeIsSet(true);
    this.arguments = arguments;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Operation(Operation other) {
    __isset_bitfield = other.__isset_bitfield;
    this.operationId = other.operationId;
    this.operationType = other.operationType;
    if (other.isSetArguments()) {
      this.arguments = other.arguments;
    }
  }

  public Operation deepCopy() {
    return new Operation(this);
  }

  @Override
  public void clear() {
    setOperationIdIsSet(false);
    this.operationId = 0;
    setOperationTypeIsSet(false);
    this.operationType = 0;
    this.arguments = null;
  }

  public int getOperationId() {
    return this.operationId;
  }

  public Operation setOperationId(int operationId) {
    this.operationId = operationId;
    setOperationIdIsSet(true);
    return this;
  }

  public void unsetOperationId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPERATIONID_ISSET_ID);
  }

  /** Returns true if field operationId is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationId() {
    return EncodingUtils.testBit(__isset_bitfield, __OPERATIONID_ISSET_ID);
  }

  public void setOperationIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPERATIONID_ISSET_ID, value);
  }

  public int getOperationType() {
    return this.operationType;
  }

  public Operation setOperationType(int operationType) {
    this.operationType = operationType;
    setOperationTypeIsSet(true);
    return this;
  }

  public void unsetOperationType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OPERATIONTYPE_ISSET_ID);
  }

  /** Returns true if field operationType is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationType() {
    return EncodingUtils.testBit(__isset_bitfield, __OPERATIONTYPE_ISSET_ID);
  }

  public void setOperationTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OPERATIONTYPE_ISSET_ID, value);
  }

  public String getArguments() {
    return this.arguments;
  }

  public Operation setArguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  public void unsetArguments() {
    this.arguments = null;
  }

  /** Returns true if field arguments is set (has been assigned a value) and false otherwise */
  public boolean isSetArguments() {
    return this.arguments != null;
  }

  public void setArgumentsIsSet(boolean value) {
    if (!value) {
      this.arguments = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OPERATION_ID:
      if (value == null) {
        unsetOperationId();
      } else {
        setOperationId((Integer)value);
      }
      break;

    case OPERATION_TYPE:
      if (value == null) {
        unsetOperationType();
      } else {
        setOperationType((Integer)value);
      }
      break;

    case ARGUMENTS:
      if (value == null) {
        unsetArguments();
      } else {
        setArguments((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATION_ID:
      return Integer.valueOf(getOperationId());

    case OPERATION_TYPE:
      return Integer.valueOf(getOperationType());

    case ARGUMENTS:
      return getArguments();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OPERATION_ID:
      return isSetOperationId();
    case OPERATION_TYPE:
      return isSetOperationType();
    case ARGUMENTS:
      return isSetArguments();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Operation)
      return this.equals((Operation)that);
    return false;
  }

  public boolean equals(Operation that) {
    if (that == null)
      return false;

    boolean this_present_operationId = true;
    boolean that_present_operationId = true;
    if (this_present_operationId || that_present_operationId) {
      if (!(this_present_operationId && that_present_operationId))
        return false;
      if (this.operationId != that.operationId)
        return false;
    }

    boolean this_present_operationType = true;
    boolean that_present_operationType = true;
    if (this_present_operationType || that_present_operationType) {
      if (!(this_present_operationType && that_present_operationType))
        return false;
      if (this.operationType != that.operationType)
        return false;
    }

    boolean this_present_arguments = true && this.isSetArguments();
    boolean that_present_arguments = true && that.isSetArguments();
    if (this_present_arguments || that_present_arguments) {
      if (!(this_present_arguments && that_present_arguments))
        return false;
      if (!this.arguments.equals(that.arguments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_operationId = true;
    list.add(present_operationId);
    if (present_operationId)
      list.add(operationId);

    boolean present_operationType = true;
    list.add(present_operationType);
    if (present_operationType)
      list.add(operationType);

    boolean present_arguments = true && (isSetArguments());
    list.add(present_arguments);
    if (present_arguments)
      list.add(arguments);

    return list.hashCode();
  }

  @Override
  public int compareTo(Operation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOperationId()).compareTo(other.isSetOperationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationId, other.operationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperationType()).compareTo(other.isSetOperationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationType, other.operationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArguments()).compareTo(other.isSetArguments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArguments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arguments, other.arguments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Operation(");
    boolean first = true;

    sb.append("operationId:");
    sb.append(this.operationId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("operationType:");
    sb.append(this.operationType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("arguments:");
    if (this.arguments == null) {
      sb.append("null");
    } else {
      sb.append(this.arguments);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OperationStandardSchemeFactory implements SchemeFactory {
    public OperationStandardScheme getScheme() {
      return new OperationStandardScheme();
    }
  }

  private static class OperationStandardScheme extends StandardScheme<Operation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Operation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operationId = iprot.readI32();
              struct.setOperationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operationType = iprot.readI32();
              struct.setOperationTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARGUMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.arguments = iprot.readString();
              struct.setArgumentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Operation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OPERATION_ID_FIELD_DESC);
      oprot.writeI32(struct.operationId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(OPERATION_TYPE_FIELD_DESC);
      oprot.writeI32(struct.operationType);
      oprot.writeFieldEnd();
      if (struct.arguments != null) {
        oprot.writeFieldBegin(ARGUMENTS_FIELD_DESC);
        oprot.writeString(struct.arguments);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OperationTupleSchemeFactory implements SchemeFactory {
    public OperationTupleScheme getScheme() {
      return new OperationTupleScheme();
    }
  }

  private static class OperationTupleScheme extends TupleScheme<Operation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Operation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOperationId()) {
        optionals.set(0);
      }
      if (struct.isSetOperationType()) {
        optionals.set(1);
      }
      if (struct.isSetArguments()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOperationId()) {
        oprot.writeI32(struct.operationId);
      }
      if (struct.isSetOperationType()) {
        oprot.writeI32(struct.operationType);
      }
      if (struct.isSetArguments()) {
        oprot.writeString(struct.arguments);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Operation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.operationId = iprot.readI32();
        struct.setOperationIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.operationType = iprot.readI32();
        struct.setOperationTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.arguments = iprot.readString();
        struct.setArgumentsIsSet(true);
      }
    }
  }

}

