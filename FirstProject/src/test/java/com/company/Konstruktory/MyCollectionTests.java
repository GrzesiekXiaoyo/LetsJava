package com.company.Konstruktory;

import com.company.MyCollection.Operation;
import com.company.MyCollection.Team;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyCollectionTests
{
		@Test
	public void WhenListIsEmptyThenStringEmptyIsReturned()
	{
		ArrayList<String> listOfPlayer = new ArrayList<>();
		Team team = new Team(listOfPlayer);

		String result = team.SelectAllPlayersOnArrayList(Operation.Iterator);

		assertEquals("",result);
	}

	@Test
	public void WhenListHaveOneElementThenElementIsReturned()
	{
		String expectedValue = "123";
		ArrayList<String> listOfPlayer = new ArrayList<>();
		listOfPlayer.add(expectedValue);
		Team team = new Team(listOfPlayer);

		String result = team.SelectAllPlayersOnArrayList(Operation.Iterator);

		assertEquals(expectedValue,result);
	}

	@Test
	public void WhenListHaveTwoElementThenElementsIsReturned()
	{
		String expectedValue = "123";
		String secondExpectedValue = "555";
		ArrayList<String> listOfPlayer = new ArrayList<>();
		listOfPlayer.add(expectedValue);
		listOfPlayer.add(secondExpectedValue);
		Team team = new Team(listOfPlayer);

		String result = team.SelectAllPlayersOnArrayList(Operation.Iterator);

		assertEquals(expectedValue+secondExpectedValue,result);
	}
}
