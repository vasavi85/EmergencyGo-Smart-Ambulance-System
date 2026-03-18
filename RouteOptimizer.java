public class RouteOptimizer {

    public static String getBestRoute(String source, String destination) {
        // Demo logic for project
        return "Best route from " + source + " to " + destination + " via Main Road (Low Traffic)";
    }

    public static void main(String[] args) {
        String route = getBestRoute("Guntur", "City Care Hospital");
        System.out.println(route);
    }
}