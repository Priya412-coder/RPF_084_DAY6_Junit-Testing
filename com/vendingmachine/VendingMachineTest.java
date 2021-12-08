package com.vendingmachine;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class VendingMachineTest {
	@Test
	public void notesTest() {
		assertEquals(1, VendingMachine.notes(100));
	}
}
