package actor;

class Chef {
    int id;
    String name;

    // We have an Order which has 5 states (things an Order knows about its self)
    // orderNew, orderComplete, orderCooking, orderCooked, orderServed

    // 1) Chef waits for orders from Waitress (orderComplete)
    // 2) When an order comes in from the Waitress status is set to orderCooking
    // 3) orderCooking is just a timeout (1 sec) then status is set to orderCooked
    // 4) orderCooked means the order is ready for the Waitess to serve

    public Chef(int id, String name) {
        this.id = id;
        this.name = name;
    }

}