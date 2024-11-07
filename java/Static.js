class Friends{
    static numberOfFriends = 0;

    constructor(user){
        this.user = user;
        numberOfFriends++;
    }
}

const total = new Friends("rode");
console.log(total);
console.log(`You have ${Friends.numberOfFriends}`);