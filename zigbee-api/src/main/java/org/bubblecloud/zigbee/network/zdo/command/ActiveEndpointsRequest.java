package org.bubblecloud.zigbee.network.zdo.command;

import org.bubblecloud.zigbee.network.zdo.ZdoCommand;

/**
 * Created by tlaukkan on 6/9/2016.
 */
public class ActiveEndpointsRequest extends ZdoCommand {
    /**
     * Destination address.
     */
    private int destinationAddress;
    /**
     * Network address of interest.
     */
    private int networkAddressOfInterest;

    public ActiveEndpointsRequest() {
    }

    public ActiveEndpointsRequest(int destinationAddress, int networkAddressOfInterest) {
        this.destinationAddress = destinationAddress;
        this.networkAddressOfInterest = networkAddressOfInterest;
    }

    public int getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(int destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public int getNetworkAddressOfInterest() {
        return networkAddressOfInterest;
    }

    public void setNetworkAddressOfInterest(int networkAddressOfInterest) {
        this.networkAddressOfInterest = networkAddressOfInterest;
    }

    @Override
    public String toString() {
        return "ActiveEndpointsRequest " +
                "destinationAddress=" + destinationAddress +
                ", networkAddressOfInterest=" + networkAddressOfInterest;
    }
}
