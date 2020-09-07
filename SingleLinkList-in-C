#include<stdio.h>
#include<stdlib.h>

struct node
{
	int info;
	struct node *link;
}*start;

void create(int data);
void display();
void insertBegin(int data);
void insertPos(int data,int pos);
void insertEnd(int data);
void deleteBegin();
void deletePos(int pos);
void deleteEnd();
void search(int data);
void reverse();
void count();

void main()
{
	int i,n,m,choice,pos;
	char ch;
	start = NULL;
	do
	{
		printf("----------------MENU----------------\n");
		printf("1.Creation of list\n");
		printf("2.Traverse/display\n");
		printf("3.Insert at beginning\n");
		printf("4.Insert after any position\n");
		printf("5.Insert at end\n");   
		printf("6.Delete at beginning\n");
		printf("7.Delete after any position\n");
		printf("8.Delete at end\n");
		printf("9.Count number of nodes\n");
		printf("10.Search a given node\n");
		printf("11.Reverse linked List\n");
		printf("Enter choice\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
			{
				printf("No. of nodes to be created : ");
				scanf("%d",&n);
				for(i=0;i<n;i++)
				{
					printf("Enter the info part : ");
					scanf("%d",&m);
					create(m);
				}
    			printf("Creation of linked list done\n");
    		
				break;
            }
            case 2:
            {
                display();
                break;
            }
            case 3:
            {
                printf("Enter the info part of the node to be inserted : ");
                scanf("%d",&m);
                insertBegin(m);
                break;
            }
			case 4:
            {
                printf("Enter the info part of the node to be inserted : ");
                scanf("%d",&m);
				printf("Enter the position afer which insertion will be done : ");
				scanf("%d",&pos);
                insertPos(m,pos);
                break;
            }
	    case 5:
            {
                printf("Enter the info part of the node to be inserted : ");
                scanf("%d",&m);
                insertEnd(m);
                break;
            }
            case 6:
            {
            	deleteBegin();
            	break;
            }
            case 7:
            {
            	printf("Enter the position after which the node is to be deleted:\n");
            	scanf("%d",&pos);
            	deletePos(pos);
            	break;
            }
            case 8:
            {
            	deleteEnd();
            	break;
            }
	    case 9:
	    {
		    count();
		    break;
 	    }
	    case 10:
	    {
		    int data;
		    printf("Enter element you want to search: \n");
		    scanf("%d",&data);
 		    search(data);
		    break;
	    }
	    case 11:
	    {
		    reverse();
 	    }

	    default:
	    {
		    printf("Wrong case");
	    }
	     }
        printf("You want to continue(Y/N)?\n");
        scanf(" %c",&ch);
    }while(ch=='y'||ch=='Y');
}
void create(int data)
{
    struct node *temp,*q;
    temp = (struct node*) malloc(sizeof(struct node));
    temp -> info = data;
    temp -> link = NULL;
    if(start == NULL)
            start = temp;
    else
    {
        q=start;
        while(q->link!=NULL)
                q = q -> link;
        q -> link = temp;
    }
}
void display()
{
	struct node *q;
	int count = 0;
	if(start == NULL)
	{
		printf("List is empty: \n");
	}
	else
	{
		q=start;
		while(q!=NULL)
		{
			printf("%d\t", q->info);
			q=q->link;
			count++;
		}
		printf("\n");
	}
	
}
void insertBegin(int data)
{
    struct node *temp;
    temp = (struct node*) malloc(sizeof(struct node));
    temp -> info = data;
	temp -> link = start;
	start = temp;
	printf("Insertion at the beginning of the list is done.\n");
	
}
void insertPos(int data,int pos)
{
	struct node *temp,*q;
	q=start;
    temp = (struct node*) malloc(sizeof(struct node));
	int i;
	temp -> info = data;
	for(i=0;i<pos-1;i++)
	{
		q = q->link;
		if(q==NULL)
		{
			printf("less nodes present\n");
			return;
		}
	}
	temp -> info = data;
	temp -> link = q -> link;
	q -> link = temp;
	printf("Insertion after a given position in the list is done.\n");
	
}
void insertEnd(int data)
{
    struct node *temp,*q;
    temp = (struct node*) malloc(sizeof(struct node));
    temp -> info = data;
	q = start;
	while(q->link!=NULL)
	{
		q = q->link;
	}
	q->link = temp;
	temp->link = NULL;
	printf("Node inserted at the end.\n");
	
}
void deleteBegin()
{
	struct node *temp;
	if(start == NULL)
		printf("List is empty\n");
	else
	{
		temp = start;
		start = temp->link;
		free(temp);
	}
	printf("Node deleted from the beginning of the list.\n");
	
}
void deletePos(int pos)
{
	struct node *q,*temp;
	q = start;
	for(int i = 0; i<(pos-1) ; i++)
	{
		q=q->link;
		if(q==NULL)
		{
			printf("Deletion not possible \n");

			return;
		}
	}
	temp = q->link;
	q->link = temp->link;
	free(temp);
	printf("Node deleted after a given position from the list.\n");
	
}
void deleteEnd()
{
	struct node *q,*q1;
	q = start;
	if(q==NULL)
	{
		printf("Deletion not possible \n");

		return;
	}
	while(q->link!=NULL)
	{
		q1 = q;
		q = q->link;
	}
	q1->link=NULL;
	free(q);
	printf("Node deleted at the end of the list.\n");
	
}
void count()
{
	struct node *q;
	int count=0;
	if(start==NULL)
	{
		printf("List is empty:\n");
	}
	else
	{
		q=start;
		while(q!=NULL)
		{
			q=q->link;
			count++;
		}
		printf("Total nodes present in linked list is:%d\n",count);
	}
}
void search(int data)
{
struct node *q;
int c=0;
if(start==NULL)
	
printf("list is empty\n");
else
{
	q=start;
	while(q!=NULL)
	{
		if(q->info==data)
			break;
		else
		{
			c++;
			q=q->link;
		}
	}
	printf("Item found at position %d\n",(c+1));
}}
void reverse()
{
	struct node *p1,*p2,*p3;
	if(start==NULL)
	{
		printf("List is empty\n");
		return;
	}
	else if(start->link==NULL)
	{
		printf("List has only 1 node");
		return;
	}
	else
	{
		p1=start;
		p2=p1->link;
		p3=p2->link;
		p1->link=NULL;
		p2->link=p1;
		while(p3!=NULL)
		{
			p1=p2;
			p2=p3;
			p3=p3->link;
			p2->link=p1;
		}
		start=p2;
	}
}
