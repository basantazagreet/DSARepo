// 1) Array insertion (Right Array lai 1 step sareko)
//i starts from far right
for (let i = main_array.length - 1; i >= 0; i--) {

    //Position vanda right ka lai 1 step right sareko
    if (i >= new_position) {
        main_array[i + 1] = main_array[i];

        //position aayesi insert gareko
        if (i == new_position) {
            main_array[i] = new_el;
        }
    }
}

// 2) Array deletion
//right to left swap and last element removed by decreasing length
for (let i = del_pos; i < data.length - 1; i++) {
    data[i] = data[i + 1];
}
data.length--;


// 3) Second loop vitra in array merge. 
array3[array1.length + i] = array2[i];

// 4) Array merge using while loop(a1,a2,a3 are counters)
while (a1 < array1.length || a2 < array2.length) {
    //smaller lai array3 ma rakhdai gako
    if (array1[a1] < array2[a2]) {
        array3[a3] = array1[a1];
        a1++;
    } else {
        array3[a3] = array2[a2];
        a2++;
    }
    a3++;
}

//5)Simple Recursion with factorial
function factorial(num) {
    if (num == 0) {
        return 1;
    }
    return (num * factorial(num - 1));

}


// 6) Array reverse with recursion
function reverseArray(arr, start, end) {

    if (start <= end) {
        let temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        //start right tira jancha, end left tira equal position ma aaye swap ko recursion complete huncha
        reverseArray(data2, start + 1, end - 1)
    }
}

//7)Tail recusion (debugger ma herni)

//8) Bubble sort, simple i,j loop sort 
//data ko loop according to position not according to each item
for (let i = 0; i < data.length; i++) {

    //data item ko individual loop matching each other element
    for (let j = 0; j < data.length; j++) {
        if (data[j] > data[j + 1]) {

            //left ko item greater vaye swap gardai jane
            let temp = data[j];
            data[j] = data[j + 1];
            data[j + 1] = temp;
        }
    }
}

// 9)Simple stack push and pop using array length only
function push(val) {

    if (len > 10) {
        alert("Max stack size reached");
    }
    //End ma value insert ra len badhayera array resize
    data[len] = val;
    len++;
}

function pop() {
    if (data.length <= 0) {
        alert('No Item in stack to pop');
    }
    //Just end ko element hatauna array resize gareko
    data.length = (len - 1);
    len--;
}

//10)String reverse using stack
//Temporarily data ma vacha kaam last ma item mai gacha so doesnt matter

function stringReverse(item) {
    for (let i = 0; i < item.length; i++) {
        push(item[i]); //data ma sabai push hune vayo just copy gareko
    }


    for (let i = 0; i < item.length; i++) {
        item[i] = pop(); //item ma assigned hune vayo data[] ko end bata pop hudai
    }

}

//11)Queue. Removed from 0(head), added from rear(end)
function dequeue() {
    if (len <= 0) {
        console.log('Queue is empty');
    } else {
        //Sabai values 1 step left sarincha
        for (let i = 0; i < item.length; i++) {
            item[i] = item[i + 1];
        }
    }
    len--;
    //Last ko undefined element hatauna array resize gareko
    item.length = len;
}

//12)Binary search iterative using while loop
//start left ma vaye end ko
while (start <= end) {
    let mid = Math.floor((start + end) / 2);

    if (data[mid] === find) {
        position = mid;
        break;
        //Sorted array ho so mid item if left ma vaye find ko .
    } else if (find > data[mid]) {
        //right half ma search
        start = mid + 1;
    } else {
        //Left half ma search
        end = mid - 1;
    }
}

//13)Binary search recursive
function binarySearch(data, start, end) {
    let mid = Math.floor((start + end) / 2);

    if (data[mid] === find) {
        position = mid;
        return true;
    } else if (data[mid] < find) {
        binarySearch(data, mid + 1, end)
    } else {
        binarySearch(data, start, mid - 1)
    }
}

//14)Selection sort (select smallest and swap)
function selectionSort(data) {
    for (let i = 0; i < data.length; i++) {
        let current_position = i;

        //i+1 bata suru ho
        for (let j = i + 1; j < data.length; j++) {
            if (data[j] < data[current_position]) {
                //Swap garna parni position vetauna
                current_position = j;
            }
        }
        //J loop sakesi balla swap garni ho i sanga
        let temp = data[current_position];
        data[current_position] = data[i];
        data[i] = temp;
    }
}

//15)Insertion sort

function insertionSort(data) {
    //Aafai sanga compare garna pardaina
    for (let i = 1; i < data.length; i++) {
        current_element = data[i];
        //Backloop lai starts from i-1 and runs on front section
        let j = i - 1;
        //run till zero and if data[j] is bigger, if it was smaller or equal than front section is sorted
        while (j >= 0 && data[j] > current_element) {
            //loop vitra ko current_element ma j ko val halne, 
            data[j + 1] = data[j];//fulcrum✅✅✅✅
            j--;
            //loop ko last ma (j+1) ma euta redundant value bascha j=-1 vaye loop break huncha
        }

        //Backloop ko first element(pachadi bata first) ma lyayera redundant thau ma current element insert gareko
        data[j + 1] = current_element;
    }
}

//16)Anagram ma for of loop ma ch in obj[ch]++ gareko
obj_str1[ch] = (obj_str1[ch] || 0) + 1;

//yehi chij for loop ma instead of for of
let key = str[i];
if (!strObj[key]) {
    strObj[key] = 0;
}
strObj[key]++;

//ch obj ma chaina vane anagram huna sakdaina.
if (!obj_str1[ch]) {
    return false;
}


//17)Palindrome ma start ra end check, loop complete vaye true
while (end > start) {
    if (str[start] !== str[end]) {
        result = false;
    }
    start++;
    end--;
}


//18)Max occuring char for loop vitra, key thulo vaye assign
if (max_freq_char == '' || strObj[key] > strObj[max_freq_char]) {
    max_freq_char = key;
}


//19)LinkedList initialization
class Node{
    constructor(val){
        this.data=val;
        this.next=null
    }
}
class LinkedList{
    constructor(){
        this.head = null;
    }
    append(val){
        const newNode = new Node(val);
        if(!this.head){
            this.head = newNode;
        }else{
            let current = this.head
            while(current.next!==null){

                current = current.next;
            }
            current.next = newNode;

        }
    }
}

//Alternative way (ChatGPT)
class Node {
    constructor(data, next = null) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
    }

    insertFirst(data) {
        this.head = new Node(data, this.head);
    }
}

//20)LinkedList lead node(of given index) pugna
let count = 1;
let lead = this.head;
//minus one because lead is one step before the node we want to delete
while (count < index - 1) {
    //Node moves 1 index right
    lead = lead.next;
    count++;
    //At the end of the loop, the lead node is just one step before index
}


//21)LinkedList delete element in a cetain index
//back node lai separate variable ma rakhna parcha. Lead node ma pugesi
{
    let back_node = lead.next.next;
    lead.next = back_node;
}


//21)LinkedList add element
//split the rope and merge later technique
{
    let back_node = lead_node.next;
    lead_node.next = current_node;
    lead_node.next.next = back_node;
}


//22)LinkedList search element using while loop
{
    while (loop) {
        if (lead.data == val) {
            result = lead;
            loop = false;
        }
        if (lead.next == null) {
            console.log("Not Found");
            loop = false;
        }
        lead = lead.next;
    }
    return result;
}


//23)BST initialization
class Node {
    constructor(val) {
        this.left = null;
        this.value = val;
        this.right = null;
    }
};
class BinarySearchTree {
    constructor() {
        this.root = null;
    }

    isTreeEmpty() {
        return this.root === null;
    }

    makeTree(val) {
        const new_node = new Node(val);
        if (this.root === null) {
            //Naya tree banyo
            this.root = new_node;
        } else {
            //Root is given, new_node has to go in right place through recursion on left or right
            this.insertNode(this.root, new_node);
        }
    }
    insertNode(root, new_node) {
        //Tree ko root, function call huda first parameter will point to the current root(node) which is going down
        if (new_node.value < root.value) {
            if (root.left === null) {
                root.left = new_node;
            } else {
                //Recursion suru vayo, next iteration ma left item is the root which means left child ma gayo
                this.insertNode(root.left, new_node);
            }
        } else {
            if (root.right === null) {
                root.right = new_node;
            } else {
                //right child ma gayo
                this.insertNode(root.right, new_node);
            }
        }
    }
};

// 24) BST Search
// Same technique as insertNode, return true or false using
// recursive function


//25)Breadth First Traversing (Queue use gareko aani
//shift gardai push gardai gayeko)
class BST{
bfsTraversing(){
    let queue = [];
    //Purai object nai push huncha
    queue.push(this.root);
    while (queue.length) {
        /*used to dequeue the front node (the one at the beginning of the array) usually 3 wata huncha
        current, left, right in a Queue way. First come first remove basis ma. so current goes first
        */
        let current = queue.shift();

        //shifts value left or right. empty queue ma left wa right element bascha
        if (current.left) {
            //Left child pushed
            queue.push(current.left);
        }
        if (current.right) {
            //right child pushed
            queue.push(current.right);
        }
        console.log(current.value);
        //Loop runs till all are empty
    }
}
}



// 26) Left ma element navaye root lai return as min
class BST{
findMin(root) {
    if (!root.left) {
        return root.value;
    } else {
        return this.findMin(root.left);
    }
}



//27)Delete from BST
removeData(val) {
    //Assigning new updated node in root
    this.root = this.deleteNode(this.root, val);
}

deleteNode(root, value) {
    if (root === null) {
        return null;
    }
    //Searching the delete position till value and root.value are equal
    if (value < root.value) {
        root.left = this.deleteNode(root.left, value);
    } else if (value > root.value) {
        root.right = this.deleteNode(root.right, value);
    } else {
        //Tyo position ma pugiyo equal vayo vane
        if (!root.left && !root.right) {
            //Target node ko both child navaye tya empty huncha so null return gareko
            return null;
        } else if (!root.left) {
            //Right matra vetiye right side lai nai return gardine
            return root.right;
        } else if (!root.right) {
            //Left matra vetiye left lai nai assign garna return gardine
            return root.left;
        }

        //Both left and right present vaye right side ko min value bascha
        root.value = this.findMin(root.right);
        //right node ko tyo min value pani delete garna paryo
        root.right = this.deleteNode(root.right, root.value);
    }
    return root;
}
}

//28) Graphs
//Format of data.
let mat = {
    'a': ['b', 'c', 'd'],
    'b': ['a'],
    'c': ['a', 'e'],
    'd': ['a', 'e'],
    'e': ['c', 'd'],
}
class Graph {
    constructor() {
        this.data = {}
    }
    addVertex(val) {
        if (!this.data[val]) {
            //vertex init in data obj which contains arrays as value of key
            this.data[val] = [];

        }
    }
    addEdge(v1, v2) {
        if (!this.data[v1]) {
            this.addVertex(v1)
        }
        if (!this.data[v2]) {
            this.addVertex(v2)
        }

        this.data[v1].push(v2);
        this.data[v2].push(v1);
    }
    removeEdge(v1, v2) {
        //'a': ['b', 'c', 'd'], array ma filter out v2
        this.data[v1] = this.data[v1].filter((item) => {
            return item != v2;
        });
        this.data[v2] = this.data[v2].filter((item) => {
            return item != v1;
        });
    }
    removeVertex(val) {
        if (!this.data[val]) {
            return;
        }
        //for of loop data[val] ma
        for (let item of this.data[val]) {
            this.removeEdge(item, val);
        }

        delete this.data[val]

    }


};