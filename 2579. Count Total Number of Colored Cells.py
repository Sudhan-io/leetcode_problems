''' QUESTION : There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer n, indicating that you must do the following routine for n minutes:

At the first minute, color any arbitrary unit cell blue.
Every minute thereafter, color blue every uncolored cell that touches a blue cell.
to find the no of colored grids after n no of minutes'''
class Solution:
    def coloredCells(self, n: int):
        c=2*((n)**2)-2*n+1
        return c
        
