# Connected-Provinces-Counter
This repository contains a Java solution to the "Number of Provinces" problem

## Problem Description
The problem is to determine the number of provinces in a given n x n matrix, where each cell represents a connection between two cities. A province is a group of directly or indirectly connected cities.

## Approach
The solution utilizes a depth-first search (DFS) algorithm to identify connected provinces in the matrix. The algorithm builds a graph representation of the connections using a HashMap. It then performs DFS traversal starting from each unvisited city to identify all the connected cities within a province.

## Algorithm Steps
- Create a HashMap to represent the graph of city connections.
- Iterate over the given isConnected matrix and add connections to the graph.
- Initialize a boolean array visited to keep track of visited cities.
- Initialize a variable count to store the number of provinces.
- Iterate over each city in the graph:
- If the city is unvisited, mark it as visited and increment the count.
- Perform a DFS traversal from the current city, marking all connected cities as visited.
- Return the final count as the number of provinces.

## Time Complexity
The time complexity of the solution is O(n^2), where n is the number of cities. This is because we iterate over each cell in the isConnected matrix to build the graph.

## Space Complexity
The space complexity of the solution is O(n), where n is the number of cities. This is due to the usage of the visited boolean array and the graph representation using the HashMap.
