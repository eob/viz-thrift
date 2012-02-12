/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package viz;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScrapeStatus implements org.apache.thrift.TBase<ScrapeStatus, ScrapeStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ScrapeStatus");

  private static final org.apache.thrift.protocol.TField VIEWS_STATIC_FIELD_DESC = new org.apache.thrift.protocol.TField("viewsStatic", org.apache.thrift.protocol.TType.BOOL, (short)7);
  private static final org.apache.thrift.protocol.TField VIEWS_LIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("viewsLive", org.apache.thrift.protocol.TType.BOOL, (short)8);
  private static final org.apache.thrift.protocol.TField FACETS_STATIC_FIELD_DESC = new org.apache.thrift.protocol.TField("facetsStatic", org.apache.thrift.protocol.TType.BOOL, (short)9);
  private static final org.apache.thrift.protocol.TField FACETS_LIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("facetsLive", org.apache.thrift.protocol.TType.BOOL, (short)10);
  private static final org.apache.thrift.protocol.TField DATA_STATIC_FIELD_DESC = new org.apache.thrift.protocol.TField("dataStatic", org.apache.thrift.protocol.TType.BOOL, (short)11);
  private static final org.apache.thrift.protocol.TField DATA_LIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("dataLive", org.apache.thrift.protocol.TType.BOOL, (short)12);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ScrapeStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ScrapeStatusTupleSchemeFactory());
  }

  public boolean viewsStatic; // required
  public boolean viewsLive; // required
  public boolean facetsStatic; // required
  public boolean facetsLive; // required
  public boolean dataStatic; // required
  public boolean dataLive; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VIEWS_STATIC((short)7, "viewsStatic"),
    VIEWS_LIVE((short)8, "viewsLive"),
    FACETS_STATIC((short)9, "facetsStatic"),
    FACETS_LIVE((short)10, "facetsLive"),
    DATA_STATIC((short)11, "dataStatic"),
    DATA_LIVE((short)12, "dataLive");

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
        case 7: // VIEWS_STATIC
          return VIEWS_STATIC;
        case 8: // VIEWS_LIVE
          return VIEWS_LIVE;
        case 9: // FACETS_STATIC
          return FACETS_STATIC;
        case 10: // FACETS_LIVE
          return FACETS_LIVE;
        case 11: // DATA_STATIC
          return DATA_STATIC;
        case 12: // DATA_LIVE
          return DATA_LIVE;
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
  private static final int __VIEWSSTATIC_ISSET_ID = 0;
  private static final int __VIEWSLIVE_ISSET_ID = 1;
  private static final int __FACETSSTATIC_ISSET_ID = 2;
  private static final int __FACETSLIVE_ISSET_ID = 3;
  private static final int __DATASTATIC_ISSET_ID = 4;
  private static final int __DATALIVE_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VIEWS_STATIC, new org.apache.thrift.meta_data.FieldMetaData("viewsStatic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VIEWS_LIVE, new org.apache.thrift.meta_data.FieldMetaData("viewsLive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FACETS_STATIC, new org.apache.thrift.meta_data.FieldMetaData("facetsStatic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.FACETS_LIVE, new org.apache.thrift.meta_data.FieldMetaData("facetsLive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DATA_STATIC, new org.apache.thrift.meta_data.FieldMetaData("dataStatic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DATA_LIVE, new org.apache.thrift.meta_data.FieldMetaData("dataLive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ScrapeStatus.class, metaDataMap);
  }

  public ScrapeStatus() {
    this.viewsStatic = false;

    this.viewsLive = false;

    this.facetsStatic = false;

    this.facetsLive = false;

    this.dataStatic = false;

    this.dataLive = false;

  }

  public ScrapeStatus(
    boolean viewsStatic,
    boolean viewsLive,
    boolean facetsStatic,
    boolean facetsLive,
    boolean dataStatic,
    boolean dataLive)
  {
    this();
    this.viewsStatic = viewsStatic;
    setViewsStaticIsSet(true);
    this.viewsLive = viewsLive;
    setViewsLiveIsSet(true);
    this.facetsStatic = facetsStatic;
    setFacetsStaticIsSet(true);
    this.facetsLive = facetsLive;
    setFacetsLiveIsSet(true);
    this.dataStatic = dataStatic;
    setDataStaticIsSet(true);
    this.dataLive = dataLive;
    setDataLiveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScrapeStatus(ScrapeStatus other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.viewsStatic = other.viewsStatic;
    this.viewsLive = other.viewsLive;
    this.facetsStatic = other.facetsStatic;
    this.facetsLive = other.facetsLive;
    this.dataStatic = other.dataStatic;
    this.dataLive = other.dataLive;
  }

  public ScrapeStatus deepCopy() {
    return new ScrapeStatus(this);
  }

  @Override
  public void clear() {
    this.viewsStatic = false;

    this.viewsLive = false;

    this.facetsStatic = false;

    this.facetsLive = false;

    this.dataStatic = false;

    this.dataLive = false;

  }

  public boolean isViewsStatic() {
    return this.viewsStatic;
  }

  public ScrapeStatus setViewsStatic(boolean viewsStatic) {
    this.viewsStatic = viewsStatic;
    setViewsStaticIsSet(true);
    return this;
  }

  public void unsetViewsStatic() {
    __isset_bit_vector.clear(__VIEWSSTATIC_ISSET_ID);
  }

  /** Returns true if field viewsStatic is set (has been assigned a value) and false otherwise */
  public boolean isSetViewsStatic() {
    return __isset_bit_vector.get(__VIEWSSTATIC_ISSET_ID);
  }

  public void setViewsStaticIsSet(boolean value) {
    __isset_bit_vector.set(__VIEWSSTATIC_ISSET_ID, value);
  }

  public boolean isViewsLive() {
    return this.viewsLive;
  }

  public ScrapeStatus setViewsLive(boolean viewsLive) {
    this.viewsLive = viewsLive;
    setViewsLiveIsSet(true);
    return this;
  }

  public void unsetViewsLive() {
    __isset_bit_vector.clear(__VIEWSLIVE_ISSET_ID);
  }

  /** Returns true if field viewsLive is set (has been assigned a value) and false otherwise */
  public boolean isSetViewsLive() {
    return __isset_bit_vector.get(__VIEWSLIVE_ISSET_ID);
  }

  public void setViewsLiveIsSet(boolean value) {
    __isset_bit_vector.set(__VIEWSLIVE_ISSET_ID, value);
  }

  public boolean isFacetsStatic() {
    return this.facetsStatic;
  }

  public ScrapeStatus setFacetsStatic(boolean facetsStatic) {
    this.facetsStatic = facetsStatic;
    setFacetsStaticIsSet(true);
    return this;
  }

  public void unsetFacetsStatic() {
    __isset_bit_vector.clear(__FACETSSTATIC_ISSET_ID);
  }

  /** Returns true if field facetsStatic is set (has been assigned a value) and false otherwise */
  public boolean isSetFacetsStatic() {
    return __isset_bit_vector.get(__FACETSSTATIC_ISSET_ID);
  }

  public void setFacetsStaticIsSet(boolean value) {
    __isset_bit_vector.set(__FACETSSTATIC_ISSET_ID, value);
  }

  public boolean isFacetsLive() {
    return this.facetsLive;
  }

  public ScrapeStatus setFacetsLive(boolean facetsLive) {
    this.facetsLive = facetsLive;
    setFacetsLiveIsSet(true);
    return this;
  }

  public void unsetFacetsLive() {
    __isset_bit_vector.clear(__FACETSLIVE_ISSET_ID);
  }

  /** Returns true if field facetsLive is set (has been assigned a value) and false otherwise */
  public boolean isSetFacetsLive() {
    return __isset_bit_vector.get(__FACETSLIVE_ISSET_ID);
  }

  public void setFacetsLiveIsSet(boolean value) {
    __isset_bit_vector.set(__FACETSLIVE_ISSET_ID, value);
  }

  public boolean isDataStatic() {
    return this.dataStatic;
  }

  public ScrapeStatus setDataStatic(boolean dataStatic) {
    this.dataStatic = dataStatic;
    setDataStaticIsSet(true);
    return this;
  }

  public void unsetDataStatic() {
    __isset_bit_vector.clear(__DATASTATIC_ISSET_ID);
  }

  /** Returns true if field dataStatic is set (has been assigned a value) and false otherwise */
  public boolean isSetDataStatic() {
    return __isset_bit_vector.get(__DATASTATIC_ISSET_ID);
  }

  public void setDataStaticIsSet(boolean value) {
    __isset_bit_vector.set(__DATASTATIC_ISSET_ID, value);
  }

  public boolean isDataLive() {
    return this.dataLive;
  }

  public ScrapeStatus setDataLive(boolean dataLive) {
    this.dataLive = dataLive;
    setDataLiveIsSet(true);
    return this;
  }

  public void unsetDataLive() {
    __isset_bit_vector.clear(__DATALIVE_ISSET_ID);
  }

  /** Returns true if field dataLive is set (has been assigned a value) and false otherwise */
  public boolean isSetDataLive() {
    return __isset_bit_vector.get(__DATALIVE_ISSET_ID);
  }

  public void setDataLiveIsSet(boolean value) {
    __isset_bit_vector.set(__DATALIVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VIEWS_STATIC:
      if (value == null) {
        unsetViewsStatic();
      } else {
        setViewsStatic((Boolean)value);
      }
      break;

    case VIEWS_LIVE:
      if (value == null) {
        unsetViewsLive();
      } else {
        setViewsLive((Boolean)value);
      }
      break;

    case FACETS_STATIC:
      if (value == null) {
        unsetFacetsStatic();
      } else {
        setFacetsStatic((Boolean)value);
      }
      break;

    case FACETS_LIVE:
      if (value == null) {
        unsetFacetsLive();
      } else {
        setFacetsLive((Boolean)value);
      }
      break;

    case DATA_STATIC:
      if (value == null) {
        unsetDataStatic();
      } else {
        setDataStatic((Boolean)value);
      }
      break;

    case DATA_LIVE:
      if (value == null) {
        unsetDataLive();
      } else {
        setDataLive((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VIEWS_STATIC:
      return Boolean.valueOf(isViewsStatic());

    case VIEWS_LIVE:
      return Boolean.valueOf(isViewsLive());

    case FACETS_STATIC:
      return Boolean.valueOf(isFacetsStatic());

    case FACETS_LIVE:
      return Boolean.valueOf(isFacetsLive());

    case DATA_STATIC:
      return Boolean.valueOf(isDataStatic());

    case DATA_LIVE:
      return Boolean.valueOf(isDataLive());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VIEWS_STATIC:
      return isSetViewsStatic();
    case VIEWS_LIVE:
      return isSetViewsLive();
    case FACETS_STATIC:
      return isSetFacetsStatic();
    case FACETS_LIVE:
      return isSetFacetsLive();
    case DATA_STATIC:
      return isSetDataStatic();
    case DATA_LIVE:
      return isSetDataLive();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScrapeStatus)
      return this.equals((ScrapeStatus)that);
    return false;
  }

  public boolean equals(ScrapeStatus that) {
    if (that == null)
      return false;

    boolean this_present_viewsStatic = true;
    boolean that_present_viewsStatic = true;
    if (this_present_viewsStatic || that_present_viewsStatic) {
      if (!(this_present_viewsStatic && that_present_viewsStatic))
        return false;
      if (this.viewsStatic != that.viewsStatic)
        return false;
    }

    boolean this_present_viewsLive = true;
    boolean that_present_viewsLive = true;
    if (this_present_viewsLive || that_present_viewsLive) {
      if (!(this_present_viewsLive && that_present_viewsLive))
        return false;
      if (this.viewsLive != that.viewsLive)
        return false;
    }

    boolean this_present_facetsStatic = true;
    boolean that_present_facetsStatic = true;
    if (this_present_facetsStatic || that_present_facetsStatic) {
      if (!(this_present_facetsStatic && that_present_facetsStatic))
        return false;
      if (this.facetsStatic != that.facetsStatic)
        return false;
    }

    boolean this_present_facetsLive = true;
    boolean that_present_facetsLive = true;
    if (this_present_facetsLive || that_present_facetsLive) {
      if (!(this_present_facetsLive && that_present_facetsLive))
        return false;
      if (this.facetsLive != that.facetsLive)
        return false;
    }

    boolean this_present_dataStatic = true;
    boolean that_present_dataStatic = true;
    if (this_present_dataStatic || that_present_dataStatic) {
      if (!(this_present_dataStatic && that_present_dataStatic))
        return false;
      if (this.dataStatic != that.dataStatic)
        return false;
    }

    boolean this_present_dataLive = true;
    boolean that_present_dataLive = true;
    if (this_present_dataLive || that_present_dataLive) {
      if (!(this_present_dataLive && that_present_dataLive))
        return false;
      if (this.dataLive != that.dataLive)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ScrapeStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ScrapeStatus typedOther = (ScrapeStatus)other;

    lastComparison = Boolean.valueOf(isSetViewsStatic()).compareTo(typedOther.isSetViewsStatic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewsStatic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.viewsStatic, typedOther.viewsStatic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViewsLive()).compareTo(typedOther.isSetViewsLive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewsLive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.viewsLive, typedOther.viewsLive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFacetsStatic()).compareTo(typedOther.isSetFacetsStatic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFacetsStatic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.facetsStatic, typedOther.facetsStatic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFacetsLive()).compareTo(typedOther.isSetFacetsLive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFacetsLive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.facetsLive, typedOther.facetsLive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataStatic()).compareTo(typedOther.isSetDataStatic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataStatic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataStatic, typedOther.dataStatic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataLive()).compareTo(typedOther.isSetDataLive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataLive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataLive, typedOther.dataLive);
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
    StringBuilder sb = new StringBuilder("ScrapeStatus(");
    boolean first = true;

    sb.append("viewsStatic:");
    sb.append(this.viewsStatic);
    first = false;
    if (!first) sb.append(", ");
    sb.append("viewsLive:");
    sb.append(this.viewsLive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("facetsStatic:");
    sb.append(this.facetsStatic);
    first = false;
    if (!first) sb.append(", ");
    sb.append("facetsLive:");
    sb.append(this.facetsLive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataStatic:");
    sb.append(this.dataStatic);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataLive:");
    sb.append(this.dataLive);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ScrapeStatusStandardSchemeFactory implements SchemeFactory {
    public ScrapeStatusStandardScheme getScheme() {
      return new ScrapeStatusStandardScheme();
    }
  }

  private static class ScrapeStatusStandardScheme extends StandardScheme<ScrapeStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ScrapeStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 7: // VIEWS_STATIC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.viewsStatic = iprot.readBool();
              struct.setViewsStaticIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // VIEWS_LIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.viewsLive = iprot.readBool();
              struct.setViewsLiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // FACETS_STATIC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.facetsStatic = iprot.readBool();
              struct.setFacetsStaticIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // FACETS_LIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.facetsLive = iprot.readBool();
              struct.setFacetsLiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // DATA_STATIC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.dataStatic = iprot.readBool();
              struct.setDataStaticIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // DATA_LIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.dataLive = iprot.readBool();
              struct.setDataLiveIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ScrapeStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VIEWS_STATIC_FIELD_DESC);
      oprot.writeBool(struct.viewsStatic);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VIEWS_LIVE_FIELD_DESC);
      oprot.writeBool(struct.viewsLive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FACETS_STATIC_FIELD_DESC);
      oprot.writeBool(struct.facetsStatic);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FACETS_LIVE_FIELD_DESC);
      oprot.writeBool(struct.facetsLive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DATA_STATIC_FIELD_DESC);
      oprot.writeBool(struct.dataStatic);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DATA_LIVE_FIELD_DESC);
      oprot.writeBool(struct.dataLive);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ScrapeStatusTupleSchemeFactory implements SchemeFactory {
    public ScrapeStatusTupleScheme getScheme() {
      return new ScrapeStatusTupleScheme();
    }
  }

  private static class ScrapeStatusTupleScheme extends TupleScheme<ScrapeStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ScrapeStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetViewsStatic()) {
        optionals.set(0);
      }
      if (struct.isSetViewsLive()) {
        optionals.set(1);
      }
      if (struct.isSetFacetsStatic()) {
        optionals.set(2);
      }
      if (struct.isSetFacetsLive()) {
        optionals.set(3);
      }
      if (struct.isSetDataStatic()) {
        optionals.set(4);
      }
      if (struct.isSetDataLive()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetViewsStatic()) {
        oprot.writeBool(struct.viewsStatic);
      }
      if (struct.isSetViewsLive()) {
        oprot.writeBool(struct.viewsLive);
      }
      if (struct.isSetFacetsStatic()) {
        oprot.writeBool(struct.facetsStatic);
      }
      if (struct.isSetFacetsLive()) {
        oprot.writeBool(struct.facetsLive);
      }
      if (struct.isSetDataStatic()) {
        oprot.writeBool(struct.dataStatic);
      }
      if (struct.isSetDataLive()) {
        oprot.writeBool(struct.dataLive);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ScrapeStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.viewsStatic = iprot.readBool();
        struct.setViewsStaticIsSet(true);
      }
      if (incoming.get(1)) {
        struct.viewsLive = iprot.readBool();
        struct.setViewsLiveIsSet(true);
      }
      if (incoming.get(2)) {
        struct.facetsStatic = iprot.readBool();
        struct.setFacetsStaticIsSet(true);
      }
      if (incoming.get(3)) {
        struct.facetsLive = iprot.readBool();
        struct.setFacetsLiveIsSet(true);
      }
      if (incoming.get(4)) {
        struct.dataStatic = iprot.readBool();
        struct.setDataStaticIsSet(true);
      }
      if (incoming.get(5)) {
        struct.dataLive = iprot.readBool();
        struct.setDataLiveIsSet(true);
      }
    }
  }

}

