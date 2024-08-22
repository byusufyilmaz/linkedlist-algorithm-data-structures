package bl5;

public class baglıste {
	Node head;
	Node tail;
	
	
	void basaekle(int data ) {
		Node eleman=new Node(data);
		if (head==null) {
			head=eleman;
			tail=eleman;
		}else {
			eleman.next=head;
			head=eleman;
		}
	}
	void sonekle(int data) {
		Node eleman=new Node(data);
		if (head==null) {
			head=eleman;
			tail=eleman;	
	}else {
		tail.next=eleman;
		tail=eleman;
	}
	}
	void arayaekle(int indis , int data ) {
		Node eleman=new Node(data);
		if (head==null && indis==0) {
			head=eleman;
			tail=eleman;
		}else if (head!=null && indis==0) {
			eleman.next=head;
			head=eleman;
		}else {
			int sayıcı=0;
			Node temp=head;
			Node temp2=head;
			while (temp.next!=null) {
				sayıcı++;
				temp2=temp;
				temp=temp.next;
			}if (sayıcı==indis) {
				temp2.next=eleman;
				eleman.next=temp;
			}else {
				int i=0;
				temp=head;
				temp2=head;
				while (i!=indis) {
					i++;
					temp2=temp;
					temp=temp.next;
				}
				temp2.next=eleman;
				eleman.next=temp;
			}
		}
	}
	void bastansil() {
		if (head==null) {
			System.out.println("silincek eleman yok");
		}else if (head.next==null) {
			head=null;
			tail=null;
		}else {
			head=head.next;
		}
	}
	
	void sondansil() {
		if (head==null) {
			System.out.println("silincek eleman yok");
		}
		else {
			Node temp=head;
			Node temp2=head;
			while(temp.next!=null) {
				temp2=temp;
				temp=temp.next;
				
			}
			temp2.next=null;
			tail=temp2;
		}	
	}
	
	void aradansil(int indis ) {
		if (head==null) {
			System.out.println("silincek eleman yok");
		}
		else if (head.next== null && indis==0) {
			head=null;
			tail=null;
		}else if (head.next!=null && indis==0) {
			head=head.next;
			
		}else {
			int say  = 0;
			Node temp=head;
			Node temp2=head;
			while (temp.next!=null) {
				temp2=temp;
				temp=temp.next;
				say++;
			}if (say==indis) {
				temp2.next=null;
				tail=temp2;
			}else {
				int sayici  = 0;
				 temp=head;
				 temp2=head;
				 while(sayici!=indis) {
					 temp2=temp;
					 temp=temp.next;
					 sayici++;
				 }
				 temp2.next=temp.next;
				 System.out.println("aradakı eleman sılındı");
			
		}
		}
	}
	void yazdir(){
		if (head==null) {
			System.out.println("yazdırılcak eleman yok");
		}else{
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data + " >>");
				temp=temp.next;
			}
		}
	}
	int  kacelemanvar() {
		if (head==null) {
			return -1;
		}else {
			int count=0;
			Node temp=head;
			while(temp!=null) {
				temp=temp.next;
				count++;
			}
			System.out.println("eleman sayısı " + count);
			return count;
		}
	}
}
