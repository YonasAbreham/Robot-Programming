# Robot-Programming

The control Program for a robot The robot moves in a two dimensional room.

The robot moves around the room by interpreting a string of commands in Swedish:

● V: Turn left (vänster)

● H: Turn right (höger)

● G: Move forward (gå)
Example string: VGGHGHGHGG

The robot can also be configured to accept commands in English:

● L: Turn left

● R: Turn right

● F: Move forward

Example string: LFFRFRFRFF

When the robot runs out of commands, it reports its current square (x,y) and direction using the following letters:

● N: North

● Ö: East

● S: South

● V: West

When the program starts, the robot is always facing north.

Example 1

We’re using a square 5x5 room, and the starting position (1,2).The input string “HGHGGHGHG” will give the result “1 3 N”.

Example 2

We’re using a circular room with a radius of 10 squares, origo at the center of the circle, and start position (0,0). The robot is configured to 
accept commands in English.The input string “RRFLFFLRF” will give the result “3 1 Ö”.
