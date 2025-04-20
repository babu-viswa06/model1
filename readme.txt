$ sudo apt update 
$ sudo apt install software-properties-common 
$ sudo add-apt-repository --yes --update ppa:ansible/ansible 
$ sudo apt install ansible
$ ansible - - version
$ ssh-keygen -t rsa -C "devops default" 
$ ls -la .ssh 
$ cat .ssh/id_rsa.pub 
$ cat .ssh/id_rsa 
$ ssh-copy-id -i ~/.ssh/id_rsa.pub "ipaddress" 
$ sudo apt install openssh-server
$ sudo systemctl restart sshd
$ sudo nano inventory
$ ansible all --key-file ~/.ssh/id_rsa -i inventory -m ping
$ ansible-playbook -i inventory playbook.yml

• su 
• sudo usermod -aG sudo “username” 
• su “username” 
