#include <stdio.h>
#include <stdlib.h>

/* Create a node which contains data and next pointer link */

struct node{

    int data;
    struct node *link;
};

struct node *head;

void push(int data){

    /* Allocate memory */

    struct node *newNode = (struct node*)malloc(sizeof(struct node));

    /* If memory is full */

    if (newNode == NULL) {

        printf("Stack Overflow \n");
        return;
    }

     /* Create new node */
     newNode->data = data;
     newNode->link = head;
     head = newNode;
}

void pop() {
 /* If there is no element to pop */
    if(head == NULL) {
        printf("Stack Underflow");
        exit(0);
 }

    struct node *p = head;

    int data;
    data = p->data;

    /* Points to next link */

    head = head->link;
    free(p);

    printf("Popped element is %d\n",data);
}

int main() {
    /*Initially head is assigned null. */
    head = NULL;

    push(4);
    push(6);
    pop();
    push(8);
    pop();
}
