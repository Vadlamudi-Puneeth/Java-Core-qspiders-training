package jan29;

public class Utility {

    public GoodsTransport parseDetails(String input) {

        String str[] = input.split(":");

        String tId = str[0];
        String dTrans = str[1];
        int rate = Integer.parseInt(str[2]);
        String type = str[3];

        if (!validateTransportId(tId)) {
            System.out.println("Transport id " + tId + " is invalid");
            System.out.println("Please provide a valid record");
            return null;
        }

        if (type.equalsIgnoreCase("BrickTransport")) {

            float brickSize = Float.parseFloat(str[4]);
            int brickQty = Integer.parseInt(str[5]);
            float brickPrice = Float.parseFloat(str[6]);

            return new BrickTransport(
                    tId,
                    dTrans,
                    rate,
                    brickSize,
                    brickQty,
                    brickPrice
            );

        } else if (type.equalsIgnoreCase("TimberTransport")) {

            float timberLength = Float.parseFloat(str[4]);
            float timberRadius = Float.parseFloat(str[5]);
            String timberType = str[6];
            float timberPrice = Float.parseFloat(str[7]);

            return new TimberTransport(
                    tId,
                    dTrans,
                    rate,
                    timberLength,
                    timberRadius,
                    timberType,
                    timberPrice
            );
        }

        return null;
    }

    public boolean validateTransportId(String transportId) {
        return transportId.matches("RTS[0-9]{3}[A-Z]");
    }

    public String findObjectType(GoodsTransport goodsTransport) {

        if (goodsTransport instanceof TimberTransport)
            return "TimberTransport";

        else if (goodsTransport instanceof BrickTransport)
            return "BrickTransport";

        return "Unknown";
    }
}