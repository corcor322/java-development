package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_RoomStatusChange_OccupiedAndDirty() {
        // Arrange
        Room room = new Room(0,129, true);
        boolean availibility = false;
        boolean expectedAvailability = false;
        boolean expectedDirty = true;

        // Apply
        room.checkIn();

        // Assert
        assertEquals(expectedAvailability, room.isAvailable());
        assertEquals(expectedDirty, room.isDirty());

    }

    @Test
    void checkOut_RoomStatusChange_Unoccupied() {
        // Arrange

        // Apply

        // Assert

    }

    @Test
    void cleanRoom_RoomStatusChange_NotDirtyAndAvailable() {
        // Arrange

        // Apply

        // Assert

    }
}