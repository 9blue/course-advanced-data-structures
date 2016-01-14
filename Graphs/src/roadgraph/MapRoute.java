package roadgraph;


import geography.GeographicPoint;

public class MapRoute {

    private GeographicPoint start;
    private GeographicPoint end;
    private String rName;
    private String rType;
    private double len;

    public MapRoute(GeographicPoint from, GeographicPoint to, String roadName,
                 String roadType, double length){
        start = from;
        end = to;
        rName = roadName;
        rType = roadType;
        len = length;
    }

    public GeographicPoint getStart() {
        return start;
    }

    public GeographicPoint getEnd() {
        return end;
    }

    public String getRouteName() {
        return rName;
    }

    public String getRouteType() {
        return rType;
    }

    public double getRouteLength() {
        return len;
    }
}