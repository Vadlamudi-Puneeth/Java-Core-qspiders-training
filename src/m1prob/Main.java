package m1prob;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = "RTS120A:12/8/21:5:BrickTransport:6:800:40";

        String transportId = input.split(":")[0];

        // Validate transport ID
        if (!utility.validateTransportId(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return; // terminate main WITHOUT System.exit
        }

        GoodsTransport goodsTransport = utility.parseDetails(input);

        if (goodsTransport != null) {

            System.out.println("Transporter id : " + goodsTransport.getTransportId());
            System.out.println("Date of transport : " + goodsTransport.getTransportDate());
            System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

            String type = utility.findObjectiveType(goodsTransport);

            if (type.equals("BrickTransport")) {

                BrickTransport bt = (BrickTransport) goodsTransport;
                System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
                System.out.println("Brick price : " + bt.getBrickPrice());
                System.out.println("Vehicle for transport : " + bt.vehicleSelection());
                System.out.println("Total charge : " + bt.calculateTotalCharge());

            } else if (type.equals("TimberTransport")) {

                TimberTransport tt = (TimberTransport) goodsTransport;
                System.out.println("Type of the timber : " + tt.getTimberType());
                System.out.println("Timber price per kilo : " + tt.getTimberPrice());
                System.out.println("Vehicle for transport : " + tt.vehicleSelection());
                System.out.println("Total charge : " + tt.calculateTotalCharge());
            }
        }

        sc.close();
    }
}
