namespace java viz

/*
 * Primitive Elements
 */

struct Feature {
  1: string key;
  2: double value;
}

struct Geometry {
  1: i32 x;
  2: i32 y;
  3: i32 h;
  4: i32 w;
}

struct WebSource {
  1: string url;
  2: string kind;
  3: string domain;
  4: string content;
}

/*
 * Scrape housekeeping
 */

struct ScrapeStatus {
  7: bool viewsStatic = false;
  8: bool viewsLive = false;
  9: bool facetsStatic = false;
  10: bool facetsLive = false;
  11: bool dataStatic = false;
  12: bool dataLive = false;
}

/*
 * Data-related components
 */

struct Property {
  1: string name;
  2: string kind = "string";
  3: list<Feature> features;
}

struct Triple {
  1: string s;
  2: string p;
  3: string o;
}

struct Data {
  1: list<WebSource> sources;
  2: list<Triple> triples;
  3: list<Feature> features;
}

/*
 * Visualization components
 */

struct Facet {
  1: string label;
  2: string kind;
  3: string expression;
  4: string html;
  5: string orientation;
  6: Geometry geometry;
  7: map<string, string> htmlProps;
}

struct View {
  1: string label;
  2: string kind;
  3: string expression;
  4: string html;
  5: Geometry geometry;
  6: map<string, string> htmlProps;
}

struct Lens {
  1: string html;
  2: list<string> containedFields;
  3: map<string, string> htmlProps;
}

struct Visualization {
  1: WebSource source, 
  2: Data data,
  3: list<View> views,
  4: list<Facet> facets,
  5: list<Lens> lenses,
  6: ScrapeStatus scrapeStatus
}
