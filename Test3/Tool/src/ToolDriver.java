public class ToolDriver {
    // class driving the tools and toolshed classes
    public static void main(String args[]) {
        long l = System.currentTimeMillis();
        // declare tool collection
        Tool[] toolCollection = new Tool[5];

        // add tools to the tool collection
        toolCollection[0] = new Hammer(500.0f, 2000.0f);
        toolCollection[1] = new Chisel(300.0f, 1000.0f);
        toolCollection[2] = new PowerDrill(1000.0f, 10000.0f);
        toolCollection[3] = new Hammer(600.0f, 0.02f); // cheap hammer!
        toolCollection[4] = new Chisel(400.0f, 1100.0f);


        System.out.println("--------------------------");
        // use each tool
        for (int i = 0; i < toolCollection.length; i++) {
            // use each tool 1 time.
            toolCollection[i].useTool(1);
        }

        System.out.println("--------------------------");

        // view tool collection as a collection of assets
        Asset[] assetCollection = toolCollection;
        // for each tool (viewed as asset)
        for (int i = 0; i < assetCollection.length; i++) {
            // use each tool 1 time.
            System.out.println(assetCollection[i].getValue());
        }

        System.out.println("--------------------------");
        // print the the tools' weight
        // use each tool
        for (int i = 0; i < toolCollection.length; i++) {
            // use each tool 1 time.
            System.out.println(toolCollection[i].getWeight());
        }

        System.out.println("--------------------------");
        // some specific uses
        System.out.println(((HandTool) toolCollection[1]).isSharp());
        System.out.println(((HandTool) toolCollection[0]).isSharp());
        System.out.println(((PowerTool) toolCollection[2]).getPower());


        System.out.println("--------------------------");
        // hammer that cheap hammer until it's worth zero!
        toolCollection[3].useTool(3);
        System.out.println(toolCollection[3].getValue());

        System.out.println("--------------------------");
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }
/*        super:
        --------------------------
        Bang!
        Scrape
        Zssh!
        Bang!
        Scrape
        --------------------------
        1999.99
        999.98
        9999.97
        0.01
        1099.98
        --------------------------
        500.0
        300.0
        1000.0
        600.0
        400.0
        --------------------------
        true
        true
        800
        --------------------------
        -0.02
        --------------------------*/


}

