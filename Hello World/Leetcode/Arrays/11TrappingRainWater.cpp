/*
Q) Trapping rain water (GeeksforGeeks) Medium
Given an array arr[] of N non-negative integers representing height of 
blocks at index i as Ai where the width of each block is 1. Compute
how much water can be trapped in between blocks after raining.
*/

#include <iostream>
using namespace std;

int trappingWater(int arr[], int n){
    int lmax[n]; lmax[0] = arr[0];
    for(int i=1; i<n; i++){
        int temp = max(arr[i], lmax[i-1]);
        lmax[i] = temp;
    }

    int rmax[n]; rmax[n-1] = arr[n-1];
    for(int i=n-2; i>=0; i--){
        int temp = max(arr[i], rmax[i+1]);
        rmax[i] = temp;
    }

    int water=0;
    for(int i=1; i<n-1; i++){
        //Aahile samma ko lmax ra rmax ho.
        water += min(lmax[i], rmax[i]) - arr[i];
    }
    return water;
}