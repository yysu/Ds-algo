#include <stdio.h>
#include <stdlib.h>
struct Node {
    int data;
    struct Node *next;
};
void showList(struct Node **head){
    struct Node *ptr = *head;
    while(ptr != NULL) {
        printf("%d \n",ptr -> data);
        ptr = ptr -> next;
    }
}
int main() {
    struct Node *head = NULL;
    //head = (struct Node *)malloc(sizeof(struct Node));
    struct Node temp;
    struct Node temp2;
    head = &temp;
    temp.data = 1;
    temp2.data = 2;
    temp.next = &temp2;
    showList(&head);
}
