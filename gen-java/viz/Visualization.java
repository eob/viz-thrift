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

public class Visualization implements org.apache.thrift.TBase<Visualization, Visualization._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Visualization");

  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField VIEWS_FIELD_DESC = new org.apache.thrift.protocol.TField("views", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField FACETS_FIELD_DESC = new org.apache.thrift.protocol.TField("facets", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField LENSES_FIELD_DESC = new org.apache.thrift.protocol.TField("lenses", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField SCRAPE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("scrapeStatus", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new VisualizationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new VisualizationTupleSchemeFactory());
  }

  public WebSource source; // required
  public Data data; // required
  public List<View> views; // required
  public List<Facet> facets; // required
  public List<Lens> lenses; // required
  public ScrapeStatus scrapeStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE((short)1, "source"),
    DATA((short)2, "data"),
    VIEWS((short)3, "views"),
    FACETS((short)4, "facets"),
    LENSES((short)5, "lenses"),
    SCRAPE_STATUS((short)6, "scrapeStatus");

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
        case 1: // SOURCE
          return SOURCE;
        case 2: // DATA
          return DATA;
        case 3: // VIEWS
          return VIEWS;
        case 4: // FACETS
          return FACETS;
        case 5: // LENSES
          return LENSES;
        case 6: // SCRAPE_STATUS
          return SCRAPE_STATUS;
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
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WebSource.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Data.class)));
    tmpMap.put(_Fields.VIEWS, new org.apache.thrift.meta_data.FieldMetaData("views", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, View.class))));
    tmpMap.put(_Fields.FACETS, new org.apache.thrift.meta_data.FieldMetaData("facets", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Facet.class))));
    tmpMap.put(_Fields.LENSES, new org.apache.thrift.meta_data.FieldMetaData("lenses", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Lens.class))));
    tmpMap.put(_Fields.SCRAPE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("scrapeStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ScrapeStatus.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Visualization.class, metaDataMap);
  }

  public Visualization() {
  }

  public Visualization(
    WebSource source,
    Data data,
    List<View> views,
    List<Facet> facets,
    List<Lens> lenses,
    ScrapeStatus scrapeStatus)
  {
    this();
    this.source = source;
    this.data = data;
    this.views = views;
    this.facets = facets;
    this.lenses = lenses;
    this.scrapeStatus = scrapeStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Visualization(Visualization other) {
    if (other.isSetSource()) {
      this.source = new WebSource(other.source);
    }
    if (other.isSetData()) {
      this.data = new Data(other.data);
    }
    if (other.isSetViews()) {
      List<View> __this__views = new ArrayList<View>();
      for (View other_element : other.views) {
        __this__views.add(new View(other_element));
      }
      this.views = __this__views;
    }
    if (other.isSetFacets()) {
      List<Facet> __this__facets = new ArrayList<Facet>();
      for (Facet other_element : other.facets) {
        __this__facets.add(new Facet(other_element));
      }
      this.facets = __this__facets;
    }
    if (other.isSetLenses()) {
      List<Lens> __this__lenses = new ArrayList<Lens>();
      for (Lens other_element : other.lenses) {
        __this__lenses.add(new Lens(other_element));
      }
      this.lenses = __this__lenses;
    }
    if (other.isSetScrapeStatus()) {
      this.scrapeStatus = new ScrapeStatus(other.scrapeStatus);
    }
  }

  public Visualization deepCopy() {
    return new Visualization(this);
  }

  @Override
  public void clear() {
    this.source = null;
    this.data = null;
    this.views = null;
    this.facets = null;
    this.lenses = null;
    this.scrapeStatus = null;
  }

  public WebSource getSource() {
    return this.source;
  }

  public Visualization setSource(WebSource source) {
    this.source = source;
    return this;
  }

  public void unsetSource() {
    this.source = null;
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return this.source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  public Data getData() {
    return this.data;
  }

  public Visualization setData(Data data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public int getViewsSize() {
    return (this.views == null) ? 0 : this.views.size();
  }

  public java.util.Iterator<View> getViewsIterator() {
    return (this.views == null) ? null : this.views.iterator();
  }

  public void addToViews(View elem) {
    if (this.views == null) {
      this.views = new ArrayList<View>();
    }
    this.views.add(elem);
  }

  public List<View> getViews() {
    return this.views;
  }

  public Visualization setViews(List<View> views) {
    this.views = views;
    return this;
  }

  public void unsetViews() {
    this.views = null;
  }

  /** Returns true if field views is set (has been assigned a value) and false otherwise */
  public boolean isSetViews() {
    return this.views != null;
  }

  public void setViewsIsSet(boolean value) {
    if (!value) {
      this.views = null;
    }
  }

  public int getFacetsSize() {
    return (this.facets == null) ? 0 : this.facets.size();
  }

  public java.util.Iterator<Facet> getFacetsIterator() {
    return (this.facets == null) ? null : this.facets.iterator();
  }

  public void addToFacets(Facet elem) {
    if (this.facets == null) {
      this.facets = new ArrayList<Facet>();
    }
    this.facets.add(elem);
  }

  public List<Facet> getFacets() {
    return this.facets;
  }

  public Visualization setFacets(List<Facet> facets) {
    this.facets = facets;
    return this;
  }

  public void unsetFacets() {
    this.facets = null;
  }

  /** Returns true if field facets is set (has been assigned a value) and false otherwise */
  public boolean isSetFacets() {
    return this.facets != null;
  }

  public void setFacetsIsSet(boolean value) {
    if (!value) {
      this.facets = null;
    }
  }

  public int getLensesSize() {
    return (this.lenses == null) ? 0 : this.lenses.size();
  }

  public java.util.Iterator<Lens> getLensesIterator() {
    return (this.lenses == null) ? null : this.lenses.iterator();
  }

  public void addToLenses(Lens elem) {
    if (this.lenses == null) {
      this.lenses = new ArrayList<Lens>();
    }
    this.lenses.add(elem);
  }

  public List<Lens> getLenses() {
    return this.lenses;
  }

  public Visualization setLenses(List<Lens> lenses) {
    this.lenses = lenses;
    return this;
  }

  public void unsetLenses() {
    this.lenses = null;
  }

  /** Returns true if field lenses is set (has been assigned a value) and false otherwise */
  public boolean isSetLenses() {
    return this.lenses != null;
  }

  public void setLensesIsSet(boolean value) {
    if (!value) {
      this.lenses = null;
    }
  }

  public ScrapeStatus getScrapeStatus() {
    return this.scrapeStatus;
  }

  public Visualization setScrapeStatus(ScrapeStatus scrapeStatus) {
    this.scrapeStatus = scrapeStatus;
    return this;
  }

  public void unsetScrapeStatus() {
    this.scrapeStatus = null;
  }

  /** Returns true if field scrapeStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetScrapeStatus() {
    return this.scrapeStatus != null;
  }

  public void setScrapeStatusIsSet(boolean value) {
    if (!value) {
      this.scrapeStatus = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((WebSource)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((Data)value);
      }
      break;

    case VIEWS:
      if (value == null) {
        unsetViews();
      } else {
        setViews((List<View>)value);
      }
      break;

    case FACETS:
      if (value == null) {
        unsetFacets();
      } else {
        setFacets((List<Facet>)value);
      }
      break;

    case LENSES:
      if (value == null) {
        unsetLenses();
      } else {
        setLenses((List<Lens>)value);
      }
      break;

    case SCRAPE_STATUS:
      if (value == null) {
        unsetScrapeStatus();
      } else {
        setScrapeStatus((ScrapeStatus)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE:
      return getSource();

    case DATA:
      return getData();

    case VIEWS:
      return getViews();

    case FACETS:
      return getFacets();

    case LENSES:
      return getLenses();

    case SCRAPE_STATUS:
      return getScrapeStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SOURCE:
      return isSetSource();
    case DATA:
      return isSetData();
    case VIEWS:
      return isSetViews();
    case FACETS:
      return isSetFacets();
    case LENSES:
      return isSetLenses();
    case SCRAPE_STATUS:
      return isSetScrapeStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Visualization)
      return this.equals((Visualization)that);
    return false;
  }

  public boolean equals(Visualization that) {
    if (that == null)
      return false;

    boolean this_present_source = true && this.isSetSource();
    boolean that_present_source = true && that.isSetSource();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_views = true && this.isSetViews();
    boolean that_present_views = true && that.isSetViews();
    if (this_present_views || that_present_views) {
      if (!(this_present_views && that_present_views))
        return false;
      if (!this.views.equals(that.views))
        return false;
    }

    boolean this_present_facets = true && this.isSetFacets();
    boolean that_present_facets = true && that.isSetFacets();
    if (this_present_facets || that_present_facets) {
      if (!(this_present_facets && that_present_facets))
        return false;
      if (!this.facets.equals(that.facets))
        return false;
    }

    boolean this_present_lenses = true && this.isSetLenses();
    boolean that_present_lenses = true && that.isSetLenses();
    if (this_present_lenses || that_present_lenses) {
      if (!(this_present_lenses && that_present_lenses))
        return false;
      if (!this.lenses.equals(that.lenses))
        return false;
    }

    boolean this_present_scrapeStatus = true && this.isSetScrapeStatus();
    boolean that_present_scrapeStatus = true && that.isSetScrapeStatus();
    if (this_present_scrapeStatus || that_present_scrapeStatus) {
      if (!(this_present_scrapeStatus && that_present_scrapeStatus))
        return false;
      if (!this.scrapeStatus.equals(that.scrapeStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Visualization other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Visualization typedOther = (Visualization)other;

    lastComparison = Boolean.valueOf(isSetSource()).compareTo(typedOther.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, typedOther.source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, typedOther.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViews()).compareTo(typedOther.isSetViews());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViews()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.views, typedOther.views);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFacets()).compareTo(typedOther.isSetFacets());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFacets()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.facets, typedOther.facets);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLenses()).compareTo(typedOther.isSetLenses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLenses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lenses, typedOther.lenses);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScrapeStatus()).compareTo(typedOther.isSetScrapeStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScrapeStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scrapeStatus, typedOther.scrapeStatus);
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
    StringBuilder sb = new StringBuilder("Visualization(");
    boolean first = true;

    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      sb.append(this.source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("views:");
    if (this.views == null) {
      sb.append("null");
    } else {
      sb.append(this.views);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("facets:");
    if (this.facets == null) {
      sb.append("null");
    } else {
      sb.append(this.facets);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lenses:");
    if (this.lenses == null) {
      sb.append("null");
    } else {
      sb.append(this.lenses);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("scrapeStatus:");
    if (this.scrapeStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.scrapeStatus);
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

  private static class VisualizationStandardSchemeFactory implements SchemeFactory {
    public VisualizationStandardScheme getScheme() {
      return new VisualizationStandardScheme();
    }
  }

  private static class VisualizationStandardScheme extends StandardScheme<Visualization> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Visualization struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.source = new WebSource();
              struct.source.read(iprot);
              struct.setSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data = new Data();
              struct.data.read(iprot);
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VIEWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list70 = iprot.readListBegin();
                struct.views = new ArrayList<View>(_list70.size);
                for (int _i71 = 0; _i71 < _list70.size; ++_i71)
                {
                  View _elem72; // required
                  _elem72 = new View();
                  _elem72.read(iprot);
                  struct.views.add(_elem72);
                }
                iprot.readListEnd();
              }
              struct.setViewsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FACETS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list73 = iprot.readListBegin();
                struct.facets = new ArrayList<Facet>(_list73.size);
                for (int _i74 = 0; _i74 < _list73.size; ++_i74)
                {
                  Facet _elem75; // required
                  _elem75 = new Facet();
                  _elem75.read(iprot);
                  struct.facets.add(_elem75);
                }
                iprot.readListEnd();
              }
              struct.setFacetsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LENSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list76 = iprot.readListBegin();
                struct.lenses = new ArrayList<Lens>(_list76.size);
                for (int _i77 = 0; _i77 < _list76.size; ++_i77)
                {
                  Lens _elem78; // required
                  _elem78 = new Lens();
                  _elem78.read(iprot);
                  struct.lenses.add(_elem78);
                }
                iprot.readListEnd();
              }
              struct.setLensesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SCRAPE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.scrapeStatus = new ScrapeStatus();
              struct.scrapeStatus.read(iprot);
              struct.setScrapeStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Visualization struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        struct.source.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        struct.data.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.views != null) {
        oprot.writeFieldBegin(VIEWS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.views.size()));
          for (View _iter79 : struct.views)
          {
            _iter79.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.facets != null) {
        oprot.writeFieldBegin(FACETS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.facets.size()));
          for (Facet _iter80 : struct.facets)
          {
            _iter80.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.lenses != null) {
        oprot.writeFieldBegin(LENSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.lenses.size()));
          for (Lens _iter81 : struct.lenses)
          {
            _iter81.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.scrapeStatus != null) {
        oprot.writeFieldBegin(SCRAPE_STATUS_FIELD_DESC);
        struct.scrapeStatus.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class VisualizationTupleSchemeFactory implements SchemeFactory {
    public VisualizationTupleScheme getScheme() {
      return new VisualizationTupleScheme();
    }
  }

  private static class VisualizationTupleScheme extends TupleScheme<Visualization> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Visualization struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSource()) {
        optionals.set(0);
      }
      if (struct.isSetData()) {
        optionals.set(1);
      }
      if (struct.isSetViews()) {
        optionals.set(2);
      }
      if (struct.isSetFacets()) {
        optionals.set(3);
      }
      if (struct.isSetLenses()) {
        optionals.set(4);
      }
      if (struct.isSetScrapeStatus()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetSource()) {
        struct.source.write(oprot);
      }
      if (struct.isSetData()) {
        struct.data.write(oprot);
      }
      if (struct.isSetViews()) {
        {
          oprot.writeI32(struct.views.size());
          for (View _iter82 : struct.views)
          {
            _iter82.write(oprot);
          }
        }
      }
      if (struct.isSetFacets()) {
        {
          oprot.writeI32(struct.facets.size());
          for (Facet _iter83 : struct.facets)
          {
            _iter83.write(oprot);
          }
        }
      }
      if (struct.isSetLenses()) {
        {
          oprot.writeI32(struct.lenses.size());
          for (Lens _iter84 : struct.lenses)
          {
            _iter84.write(oprot);
          }
        }
      }
      if (struct.isSetScrapeStatus()) {
        struct.scrapeStatus.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Visualization struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.source = new WebSource();
        struct.source.read(iprot);
        struct.setSourceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.data = new Data();
        struct.data.read(iprot);
        struct.setDataIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.views = new ArrayList<View>(_list85.size);
          for (int _i86 = 0; _i86 < _list85.size; ++_i86)
          {
            View _elem87; // required
            _elem87 = new View();
            _elem87.read(iprot);
            struct.views.add(_elem87);
          }
        }
        struct.setViewsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list88 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.facets = new ArrayList<Facet>(_list88.size);
          for (int _i89 = 0; _i89 < _list88.size; ++_i89)
          {
            Facet _elem90; // required
            _elem90 = new Facet();
            _elem90.read(iprot);
            struct.facets.add(_elem90);
          }
        }
        struct.setFacetsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list91 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.lenses = new ArrayList<Lens>(_list91.size);
          for (int _i92 = 0; _i92 < _list91.size; ++_i92)
          {
            Lens _elem93; // required
            _elem93 = new Lens();
            _elem93.read(iprot);
            struct.lenses.add(_elem93);
          }
        }
        struct.setLensesIsSet(true);
      }
      if (incoming.get(5)) {
        struct.scrapeStatus = new ScrapeStatus();
        struct.scrapeStatus.read(iprot);
        struct.setScrapeStatusIsSet(true);
      }
    }
  }

}

