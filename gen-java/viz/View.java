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

public class View implements org.apache.thrift.TBase<View, View._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("View");

  private static final org.apache.thrift.protocol.TField LABEL_FIELD_DESC = new org.apache.thrift.protocol.TField("label", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KIND_FIELD_DESC = new org.apache.thrift.protocol.TField("kind", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPRESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("expression", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HTML_FIELD_DESC = new org.apache.thrift.protocol.TField("html", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField GEOMETRY_FIELD_DESC = new org.apache.thrift.protocol.TField("geometry", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField HTML_PROPS_FIELD_DESC = new org.apache.thrift.protocol.TField("htmlProps", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ViewTupleSchemeFactory());
  }

  public String label; // required
  public String kind; // required
  public String expression; // required
  public String html; // required
  public Geometry geometry; // required
  public Map<String,String> htmlProps; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LABEL((short)1, "label"),
    KIND((short)2, "kind"),
    EXPRESSION((short)3, "expression"),
    HTML((short)4, "html"),
    GEOMETRY((short)5, "geometry"),
    HTML_PROPS((short)6, "htmlProps");

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
        case 1: // LABEL
          return LABEL;
        case 2: // KIND
          return KIND;
        case 3: // EXPRESSION
          return EXPRESSION;
        case 4: // HTML
          return HTML;
        case 5: // GEOMETRY
          return GEOMETRY;
        case 6: // HTML_PROPS
          return HTML_PROPS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LABEL, new org.apache.thrift.meta_data.FieldMetaData("label", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KIND, new org.apache.thrift.meta_data.FieldMetaData("kind", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPRESSION, new org.apache.thrift.meta_data.FieldMetaData("expression", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HTML, new org.apache.thrift.meta_data.FieldMetaData("html", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GEOMETRY, new org.apache.thrift.meta_data.FieldMetaData("geometry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Geometry.class)));
    tmpMap.put(_Fields.HTML_PROPS, new org.apache.thrift.meta_data.FieldMetaData("htmlProps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(View.class, metaDataMap);
  }

  public View() {
  }

  public View(
    String label,
    String kind,
    String expression,
    String html,
    Geometry geometry,
    Map<String,String> htmlProps)
  {
    this();
    this.label = label;
    this.kind = kind;
    this.expression = expression;
    this.html = html;
    this.geometry = geometry;
    this.htmlProps = htmlProps;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public View(View other) {
    if (other.isSetLabel()) {
      this.label = other.label;
    }
    if (other.isSetKind()) {
      this.kind = other.kind;
    }
    if (other.isSetExpression()) {
      this.expression = other.expression;
    }
    if (other.isSetHtml()) {
      this.html = other.html;
    }
    if (other.isSetGeometry()) {
      this.geometry = new Geometry(other.geometry);
    }
    if (other.isSetHtmlProps()) {
      Map<String,String> __this__htmlProps = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.htmlProps.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__htmlProps_copy_key = other_element_key;

        String __this__htmlProps_copy_value = other_element_value;

        __this__htmlProps.put(__this__htmlProps_copy_key, __this__htmlProps_copy_value);
      }
      this.htmlProps = __this__htmlProps;
    }
  }

  public View deepCopy() {
    return new View(this);
  }

  @Override
  public void clear() {
    this.label = null;
    this.kind = null;
    this.expression = null;
    this.html = null;
    this.geometry = null;
    this.htmlProps = null;
  }

  public String getLabel() {
    return this.label;
  }

  public View setLabel(String label) {
    this.label = label;
    return this;
  }

  public void unsetLabel() {
    this.label = null;
  }

  /** Returns true if field label is set (has been assigned a value) and false otherwise */
  public boolean isSetLabel() {
    return this.label != null;
  }

  public void setLabelIsSet(boolean value) {
    if (!value) {
      this.label = null;
    }
  }

  public String getKind() {
    return this.kind;
  }

  public View setKind(String kind) {
    this.kind = kind;
    return this;
  }

  public void unsetKind() {
    this.kind = null;
  }

  /** Returns true if field kind is set (has been assigned a value) and false otherwise */
  public boolean isSetKind() {
    return this.kind != null;
  }

  public void setKindIsSet(boolean value) {
    if (!value) {
      this.kind = null;
    }
  }

  public String getExpression() {
    return this.expression;
  }

  public View setExpression(String expression) {
    this.expression = expression;
    return this;
  }

  public void unsetExpression() {
    this.expression = null;
  }

  /** Returns true if field expression is set (has been assigned a value) and false otherwise */
  public boolean isSetExpression() {
    return this.expression != null;
  }

  public void setExpressionIsSet(boolean value) {
    if (!value) {
      this.expression = null;
    }
  }

  public String getHtml() {
    return this.html;
  }

  public View setHtml(String html) {
    this.html = html;
    return this;
  }

  public void unsetHtml() {
    this.html = null;
  }

  /** Returns true if field html is set (has been assigned a value) and false otherwise */
  public boolean isSetHtml() {
    return this.html != null;
  }

  public void setHtmlIsSet(boolean value) {
    if (!value) {
      this.html = null;
    }
  }

  public Geometry getGeometry() {
    return this.geometry;
  }

  public View setGeometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

  public void unsetGeometry() {
    this.geometry = null;
  }

  /** Returns true if field geometry is set (has been assigned a value) and false otherwise */
  public boolean isSetGeometry() {
    return this.geometry != null;
  }

  public void setGeometryIsSet(boolean value) {
    if (!value) {
      this.geometry = null;
    }
  }

  public int getHtmlPropsSize() {
    return (this.htmlProps == null) ? 0 : this.htmlProps.size();
  }

  public void putToHtmlProps(String key, String val) {
    if (this.htmlProps == null) {
      this.htmlProps = new HashMap<String,String>();
    }
    this.htmlProps.put(key, val);
  }

  public Map<String,String> getHtmlProps() {
    return this.htmlProps;
  }

  public View setHtmlProps(Map<String,String> htmlProps) {
    this.htmlProps = htmlProps;
    return this;
  }

  public void unsetHtmlProps() {
    this.htmlProps = null;
  }

  /** Returns true if field htmlProps is set (has been assigned a value) and false otherwise */
  public boolean isSetHtmlProps() {
    return this.htmlProps != null;
  }

  public void setHtmlPropsIsSet(boolean value) {
    if (!value) {
      this.htmlProps = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LABEL:
      if (value == null) {
        unsetLabel();
      } else {
        setLabel((String)value);
      }
      break;

    case KIND:
      if (value == null) {
        unsetKind();
      } else {
        setKind((String)value);
      }
      break;

    case EXPRESSION:
      if (value == null) {
        unsetExpression();
      } else {
        setExpression((String)value);
      }
      break;

    case HTML:
      if (value == null) {
        unsetHtml();
      } else {
        setHtml((String)value);
      }
      break;

    case GEOMETRY:
      if (value == null) {
        unsetGeometry();
      } else {
        setGeometry((Geometry)value);
      }
      break;

    case HTML_PROPS:
      if (value == null) {
        unsetHtmlProps();
      } else {
        setHtmlProps((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LABEL:
      return getLabel();

    case KIND:
      return getKind();

    case EXPRESSION:
      return getExpression();

    case HTML:
      return getHtml();

    case GEOMETRY:
      return getGeometry();

    case HTML_PROPS:
      return getHtmlProps();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LABEL:
      return isSetLabel();
    case KIND:
      return isSetKind();
    case EXPRESSION:
      return isSetExpression();
    case HTML:
      return isSetHtml();
    case GEOMETRY:
      return isSetGeometry();
    case HTML_PROPS:
      return isSetHtmlProps();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof View)
      return this.equals((View)that);
    return false;
  }

  public boolean equals(View that) {
    if (that == null)
      return false;

    boolean this_present_label = true && this.isSetLabel();
    boolean that_present_label = true && that.isSetLabel();
    if (this_present_label || that_present_label) {
      if (!(this_present_label && that_present_label))
        return false;
      if (!this.label.equals(that.label))
        return false;
    }

    boolean this_present_kind = true && this.isSetKind();
    boolean that_present_kind = true && that.isSetKind();
    if (this_present_kind || that_present_kind) {
      if (!(this_present_kind && that_present_kind))
        return false;
      if (!this.kind.equals(that.kind))
        return false;
    }

    boolean this_present_expression = true && this.isSetExpression();
    boolean that_present_expression = true && that.isSetExpression();
    if (this_present_expression || that_present_expression) {
      if (!(this_present_expression && that_present_expression))
        return false;
      if (!this.expression.equals(that.expression))
        return false;
    }

    boolean this_present_html = true && this.isSetHtml();
    boolean that_present_html = true && that.isSetHtml();
    if (this_present_html || that_present_html) {
      if (!(this_present_html && that_present_html))
        return false;
      if (!this.html.equals(that.html))
        return false;
    }

    boolean this_present_geometry = true && this.isSetGeometry();
    boolean that_present_geometry = true && that.isSetGeometry();
    if (this_present_geometry || that_present_geometry) {
      if (!(this_present_geometry && that_present_geometry))
        return false;
      if (!this.geometry.equals(that.geometry))
        return false;
    }

    boolean this_present_htmlProps = true && this.isSetHtmlProps();
    boolean that_present_htmlProps = true && that.isSetHtmlProps();
    if (this_present_htmlProps || that_present_htmlProps) {
      if (!(this_present_htmlProps && that_present_htmlProps))
        return false;
      if (!this.htmlProps.equals(that.htmlProps))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(View other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    View typedOther = (View)other;

    lastComparison = Boolean.valueOf(isSetLabel()).compareTo(typedOther.isSetLabel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.label, typedOther.label);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKind()).compareTo(typedOther.isSetKind());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKind()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.kind, typedOther.kind);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpression()).compareTo(typedOther.isSetExpression());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpression()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expression, typedOther.expression);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHtml()).compareTo(typedOther.isSetHtml());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHtml()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.html, typedOther.html);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGeometry()).compareTo(typedOther.isSetGeometry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGeometry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.geometry, typedOther.geometry);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHtmlProps()).compareTo(typedOther.isSetHtmlProps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHtmlProps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.htmlProps, typedOther.htmlProps);
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
    StringBuilder sb = new StringBuilder("View(");
    boolean first = true;

    sb.append("label:");
    if (this.label == null) {
      sb.append("null");
    } else {
      sb.append(this.label);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("kind:");
    if (this.kind == null) {
      sb.append("null");
    } else {
      sb.append(this.kind);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expression:");
    if (this.expression == null) {
      sb.append("null");
    } else {
      sb.append(this.expression);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("html:");
    if (this.html == null) {
      sb.append("null");
    } else {
      sb.append(this.html);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("geometry:");
    if (this.geometry == null) {
      sb.append("null");
    } else {
      sb.append(this.geometry);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("htmlProps:");
    if (this.htmlProps == null) {
      sb.append("null");
    } else {
      sb.append(this.htmlProps);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ViewStandardSchemeFactory implements SchemeFactory {
    public ViewStandardScheme getScheme() {
      return new ViewStandardScheme();
    }
  }

  private static class ViewStandardScheme extends StandardScheme<View> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, View struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LABEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.label = iprot.readString();
              struct.setLabelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KIND
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.kind = iprot.readString();
              struct.setKindIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPRESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.expression = iprot.readString();
              struct.setExpressionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HTML
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.html = iprot.readString();
              struct.setHtmlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GEOMETRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.geometry = new Geometry();
              struct.geometry.read(iprot);
              struct.setGeometryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // HTML_PROPS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map42 = iprot.readMapBegin();
                struct.htmlProps = new HashMap<String,String>(2*_map42.size);
                for (int _i43 = 0; _i43 < _map42.size; ++_i43)
                {
                  String _key44; // required
                  String _val45; // optional
                  _key44 = iprot.readString();
                  _val45 = iprot.readString();
                  struct.htmlProps.put(_key44, _val45);
                }
                iprot.readMapEnd();
              }
              struct.setHtmlPropsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, View struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.label != null) {
        oprot.writeFieldBegin(LABEL_FIELD_DESC);
        oprot.writeString(struct.label);
        oprot.writeFieldEnd();
      }
      if (struct.kind != null) {
        oprot.writeFieldBegin(KIND_FIELD_DESC);
        oprot.writeString(struct.kind);
        oprot.writeFieldEnd();
      }
      if (struct.expression != null) {
        oprot.writeFieldBegin(EXPRESSION_FIELD_DESC);
        oprot.writeString(struct.expression);
        oprot.writeFieldEnd();
      }
      if (struct.html != null) {
        oprot.writeFieldBegin(HTML_FIELD_DESC);
        oprot.writeString(struct.html);
        oprot.writeFieldEnd();
      }
      if (struct.geometry != null) {
        oprot.writeFieldBegin(GEOMETRY_FIELD_DESC);
        struct.geometry.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.htmlProps != null) {
        oprot.writeFieldBegin(HTML_PROPS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.htmlProps.size()));
          for (Map.Entry<String, String> _iter46 : struct.htmlProps.entrySet())
          {
            oprot.writeString(_iter46.getKey());
            oprot.writeString(_iter46.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ViewTupleSchemeFactory implements SchemeFactory {
    public ViewTupleScheme getScheme() {
      return new ViewTupleScheme();
    }
  }

  private static class ViewTupleScheme extends TupleScheme<View> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, View struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLabel()) {
        optionals.set(0);
      }
      if (struct.isSetKind()) {
        optionals.set(1);
      }
      if (struct.isSetExpression()) {
        optionals.set(2);
      }
      if (struct.isSetHtml()) {
        optionals.set(3);
      }
      if (struct.isSetGeometry()) {
        optionals.set(4);
      }
      if (struct.isSetHtmlProps()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetLabel()) {
        oprot.writeString(struct.label);
      }
      if (struct.isSetKind()) {
        oprot.writeString(struct.kind);
      }
      if (struct.isSetExpression()) {
        oprot.writeString(struct.expression);
      }
      if (struct.isSetHtml()) {
        oprot.writeString(struct.html);
      }
      if (struct.isSetGeometry()) {
        struct.geometry.write(oprot);
      }
      if (struct.isSetHtmlProps()) {
        {
          oprot.writeI32(struct.htmlProps.size());
          for (Map.Entry<String, String> _iter47 : struct.htmlProps.entrySet())
          {
            oprot.writeString(_iter47.getKey());
            oprot.writeString(_iter47.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, View struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.label = iprot.readString();
        struct.setLabelIsSet(true);
      }
      if (incoming.get(1)) {
        struct.kind = iprot.readString();
        struct.setKindIsSet(true);
      }
      if (incoming.get(2)) {
        struct.expression = iprot.readString();
        struct.setExpressionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.html = iprot.readString();
        struct.setHtmlIsSet(true);
      }
      if (incoming.get(4)) {
        struct.geometry = new Geometry();
        struct.geometry.read(iprot);
        struct.setGeometryIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TMap _map48 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.htmlProps = new HashMap<String,String>(2*_map48.size);
          for (int _i49 = 0; _i49 < _map48.size; ++_i49)
          {
            String _key50; // required
            String _val51; // optional
            _key50 = iprot.readString();
            _val51 = iprot.readString();
            struct.htmlProps.put(_key50, _val51);
          }
        }
        struct.setHtmlPropsIsSet(true);
      }
    }
  }

}

